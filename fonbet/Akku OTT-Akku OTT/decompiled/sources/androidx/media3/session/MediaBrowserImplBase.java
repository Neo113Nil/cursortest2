package androidx.media3.session;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.session.MediaBrowser;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.session.SequencedFutureManager;

/* loaded from: classes3.dex */
class MediaBrowserImplBase extends MediaControllerImplBase implements MediaBrowser.MediaBrowserImpl {
    private final MediaBrowser instance;

    public interface RemoteLibrarySessionTask {
        void run(IMediaSession iMediaSession, int i) throws RemoteException;
    }

    public MediaBrowserImplBase(Context context, MediaBrowser mediaBrowser, SessionToken sessionToken, Bundle bundle, Looper looper) {
        super(context, mediaBrowser, sessionToken, bundle, looper);
        this.instance = mediaBrowser;
    }

    private <V> com.google.common.util.concurrent.u<LibraryResult<V>> dispatchRemoteLibrarySessionTask(int i, RemoteLibrarySessionTask remoteLibrarySessionTask) {
        IMediaSession sessionInterfaceWithSessionCommandIfAble = getSessionInterfaceWithSessionCommandIfAble(i);
        if (sessionInterfaceWithSessionCommandIfAble == null) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-4));
        }
        SequencedFutureManager.SequencedFuture createSequencedFuture = this.sequencedFutureManager.createSequencedFuture(LibraryResult.ofError(1));
        try {
            remoteLibrarySessionTask.run(sessionInterfaceWithSessionCommandIfAble, createSequencedFuture.getSequenceNumber());
            return createSequencedFuture;
        } catch (RemoteException e) {
            Log.w(MediaControllerImplBase.TAG, "Cannot connect to the service or the session is gone", e);
            this.sequencedFutureManager.setFutureResult(createSequencedFuture.getSequenceNumber(), LibraryResult.ofError(-100));
            return createSequencedFuture;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyChildrenChanged$1(String str, int i, MediaLibraryService.LibraryParams libraryParams, MediaBrowser.Listener listener) {
        listener.onChildrenChanged(getInstance(), str, i, libraryParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifySearchResultChanged$0(String str, int i, MediaLibraryService.LibraryParams libraryParams, MediaBrowser.Listener listener) {
        listener.onSearchResultChanged(getInstance(), str, i, libraryParams);
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> getChildren(final String str, final int i, final int i2, @Nullable final MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_GET_CHILDREN, new RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.4
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i3) throws RemoteException {
                MediaControllerStub mediaControllerStub = MediaBrowserImplBase.this.controllerStub;
                String str2 = str;
                int i4 = i;
                int i5 = i2;
                MediaLibraryService.LibraryParams libraryParams2 = libraryParams;
                iMediaSession.getChildren(mediaControllerStub, i3, str2, i4, i5, libraryParams2 == null ? null : libraryParams2.toBundle());
            }
        });
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<MediaItem>> getItem(final String str) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_GET_ITEM, new RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.5
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i) throws RemoteException {
                iMediaSession.getItem(MediaBrowserImplBase.this.controllerStub, i, str);
            }
        });
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<MediaItem>> getLibraryRoot(@Nullable final MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(50000, new RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.1
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i) throws RemoteException {
                MediaControllerStub mediaControllerStub = MediaBrowserImplBase.this.controllerStub;
                MediaLibraryService.LibraryParams libraryParams2 = libraryParams;
                iMediaSession.getLibraryRoot(mediaControllerStub, i, libraryParams2 == null ? null : libraryParams2.toBundle());
            }
        });
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> getSearchResult(final String str, final int i, final int i2, @Nullable final MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT, new RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.7
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i3) throws RemoteException {
                MediaControllerStub mediaControllerStub = MediaBrowserImplBase.this.controllerStub;
                String str2 = str;
                int i4 = i;
                int i5 = i2;
                MediaLibraryService.LibraryParams libraryParams2 = libraryParams;
                iMediaSession.getSearchResult(mediaControllerStub, i3, str2, i4, i5, libraryParams2 == null ? null : libraryParams2.toBundle());
            }
        });
    }

    public void notifyChildrenChanged(final String str, final int i, @Nullable final MediaLibraryService.LibraryParams libraryParams) {
        if (isConnected()) {
            getInstance().notifyBrowserListener(new Consumer() { // from class: androidx.media3.session.p
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    this.lambda$notifyChildrenChanged$1(str, i, libraryParams, (MediaBrowser.Listener) obj);
                }
            });
        }
    }

    public void notifySearchResultChanged(final String str, final int i, @Nullable final MediaLibraryService.LibraryParams libraryParams) {
        if (isConnected()) {
            getInstance().notifyBrowserListener(new Consumer() { // from class: androidx.media3.session.o
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    this.lambda$notifySearchResultChanged$0(str, i, libraryParams, (MediaBrowser.Listener) obj);
                }
            });
        }
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<Void>> search(final String str, @Nullable final MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_SEARCH, new RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.6
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i) throws RemoteException {
                MediaControllerStub mediaControllerStub = MediaBrowserImplBase.this.controllerStub;
                String str2 = str;
                MediaLibraryService.LibraryParams libraryParams2 = libraryParams;
                iMediaSession.search(mediaControllerStub, i, str2, libraryParams2 == null ? null : libraryParams2.toBundle());
            }
        });
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<Void>> subscribe(final String str, @Nullable final MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_SUBSCRIBE, new RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.2
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i) throws RemoteException {
                MediaControllerStub mediaControllerStub = MediaBrowserImplBase.this.controllerStub;
                String str2 = str;
                MediaLibraryService.LibraryParams libraryParams2 = libraryParams;
                iMediaSession.subscribe(mediaControllerStub, i, str2, libraryParams2 == null ? null : libraryParams2.toBundle());
            }
        });
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<Void>> unsubscribe(final String str) {
        return dispatchRemoteLibrarySessionTask(SessionCommand.COMMAND_CODE_LIBRARY_UNSUBSCRIBE, new RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.3
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(IMediaSession iMediaSession, int i) throws RemoteException {
                iMediaSession.unsubscribe(MediaBrowserImplBase.this.controllerStub, i, str);
            }
        });
    }

    @Override // androidx.media3.session.MediaControllerImplBase
    public MediaBrowser getInstance() {
        return this.instance;
    }
}
