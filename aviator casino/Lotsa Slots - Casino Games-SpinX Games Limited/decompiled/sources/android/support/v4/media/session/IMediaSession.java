package android.support.v4.media.session;

/* loaded from: classes.dex */
public interface IMediaSession extends android.os.IInterface {

    public static class Default implements android.support.v4.media.session.IMediaSession {
        @Override // android.support.v4.media.session.IMediaSession
        public void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void addQueueItemAt(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void adjustVolume(int i, int i2, java.lang.String str) throws android.os.RemoteException {
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void fastForward() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public android.os.Bundle getExtras() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public long getFlags() throws android.os.RemoteException {
            return 0L;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public android.support.v4.media.MediaMetadataCompat getMetadata() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public java.lang.String getPackageName() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public java.lang.CharSequence getQueueTitle() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public int getRatingType() throws android.os.RemoteException {
            return 0;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public int getRepeatMode() throws android.os.RemoteException {
            return 0;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public android.os.Bundle getSessionInfo() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public int getShuffleMode() throws android.os.RemoteException {
            return 0;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public java.lang.String getTag() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean isCaptioningEnabled() throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean isShuffleModeEnabledRemoved() throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean isTransportControlEnabled() throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void next() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void pause() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void play() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void playFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void playFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepare() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void previous() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void rate(android.support.v4.media.RatingCompat ratingCompat) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void rateWithExtras(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void removeQueueItemAt(int i) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void rewind() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void seekTo(long j) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void sendCustomAction(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public boolean sendMediaButton(android.view.KeyEvent keyEvent) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setCaptioningEnabled(boolean z) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setPlaybackSpeed(float f) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setRepeatMode(int i) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setShuffleMode(int i) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setShuffleModeEnabledRemoved(boolean z) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void setVolumeTo(int i, int i2, java.lang.String str) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void skipToQueueItem(long j) throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void stop() throws android.os.RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaSession
        public void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException {
        }
    }

    void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException;

    void addQueueItemAt(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) throws android.os.RemoteException;

    void adjustVolume(int i, int i2, java.lang.String str) throws android.os.RemoteException;

    void fastForward() throws android.os.RemoteException;

    android.os.Bundle getExtras() throws android.os.RemoteException;

    long getFlags() throws android.os.RemoteException;

    android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException;

    android.support.v4.media.MediaMetadataCompat getMetadata() throws android.os.RemoteException;

    java.lang.String getPackageName() throws android.os.RemoteException;

    android.support.v4.media.session.PlaybackStateCompat getPlaybackState() throws android.os.RemoteException;

    java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() throws android.os.RemoteException;

    java.lang.CharSequence getQueueTitle() throws android.os.RemoteException;

    int getRatingType() throws android.os.RemoteException;

    int getRepeatMode() throws android.os.RemoteException;

    android.os.Bundle getSessionInfo() throws android.os.RemoteException;

    int getShuffleMode() throws android.os.RemoteException;

    java.lang.String getTag() throws android.os.RemoteException;

    android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() throws android.os.RemoteException;

    boolean isCaptioningEnabled() throws android.os.RemoteException;

    boolean isShuffleModeEnabledRemoved() throws android.os.RemoteException;

    boolean isTransportControlEnabled() throws android.os.RemoteException;

    void next() throws android.os.RemoteException;

    void pause() throws android.os.RemoteException;

    void play() throws android.os.RemoteException;

    void playFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void playFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void playFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException;

    void prepare() throws android.os.RemoteException;

    void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException;

    void previous() throws android.os.RemoteException;

    void rate(android.support.v4.media.RatingCompat ratingCompat) throws android.os.RemoteException;

    void rateWithExtras(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) throws android.os.RemoteException;

    void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException;

    void removeQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException;

    void removeQueueItemAt(int i) throws android.os.RemoteException;

    void rewind() throws android.os.RemoteException;

    void seekTo(long j) throws android.os.RemoteException;

    void sendCommand(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws android.os.RemoteException;

    void sendCustomAction(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean sendMediaButton(android.view.KeyEvent keyEvent) throws android.os.RemoteException;

    void setCaptioningEnabled(boolean z) throws android.os.RemoteException;

    void setPlaybackSpeed(float f) throws android.os.RemoteException;

    void setRepeatMode(int i) throws android.os.RemoteException;

    void setShuffleMode(int i) throws android.os.RemoteException;

    void setShuffleModeEnabledRemoved(boolean z) throws android.os.RemoteException;

    void setVolumeTo(int i, int i2, java.lang.String str) throws android.os.RemoteException;

    void skipToQueueItem(long j) throws android.os.RemoteException;

    void stop() throws android.os.RemoteException;

    void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.v4.media.session.IMediaSession {
        private static final java.lang.String DESCRIPTOR = "android.support.v4.media.session.IMediaSession";
        static final int TRANSACTION_addQueueItem = 41;
        static final int TRANSACTION_addQueueItemAt = 42;
        static final int TRANSACTION_adjustVolume = 11;
        static final int TRANSACTION_fastForward = 22;
        static final int TRANSACTION_getExtras = 31;
        static final int TRANSACTION_getFlags = 9;
        static final int TRANSACTION_getLaunchPendingIntent = 8;
        static final int TRANSACTION_getMetadata = 27;
        static final int TRANSACTION_getPackageName = 6;
        static final int TRANSACTION_getPlaybackState = 28;
        static final int TRANSACTION_getQueue = 29;
        static final int TRANSACTION_getQueueTitle = 30;
        static final int TRANSACTION_getRatingType = 32;
        static final int TRANSACTION_getRepeatMode = 37;
        static final int TRANSACTION_getSessionInfo = 50;
        static final int TRANSACTION_getShuffleMode = 47;
        static final int TRANSACTION_getTag = 7;
        static final int TRANSACTION_getVolumeAttributes = 10;
        static final int TRANSACTION_isCaptioningEnabled = 45;
        static final int TRANSACTION_isShuffleModeEnabledRemoved = 38;
        static final int TRANSACTION_isTransportControlEnabled = 5;
        static final int TRANSACTION_next = 20;
        static final int TRANSACTION_pause = 18;
        static final int TRANSACTION_play = 13;
        static final int TRANSACTION_playFromMediaId = 14;
        static final int TRANSACTION_playFromSearch = 15;
        static final int TRANSACTION_playFromUri = 16;
        static final int TRANSACTION_prepare = 33;
        static final int TRANSACTION_prepareFromMediaId = 34;
        static final int TRANSACTION_prepareFromSearch = 35;
        static final int TRANSACTION_prepareFromUri = 36;
        static final int TRANSACTION_previous = 21;
        static final int TRANSACTION_rate = 25;
        static final int TRANSACTION_rateWithExtras = 51;
        static final int TRANSACTION_registerCallbackListener = 3;
        static final int TRANSACTION_removeQueueItem = 43;
        static final int TRANSACTION_removeQueueItemAt = 44;
        static final int TRANSACTION_rewind = 23;
        static final int TRANSACTION_seekTo = 24;
        static final int TRANSACTION_sendCommand = 1;
        static final int TRANSACTION_sendCustomAction = 26;
        static final int TRANSACTION_sendMediaButton = 2;
        static final int TRANSACTION_setCaptioningEnabled = 46;
        static final int TRANSACTION_setPlaybackSpeed = 49;
        static final int TRANSACTION_setRepeatMode = 39;
        static final int TRANSACTION_setShuffleMode = 48;
        static final int TRANSACTION_setShuffleModeEnabledRemoved = 40;
        static final int TRANSACTION_setVolumeTo = 12;
        static final int TRANSACTION_skipToQueueItem = 17;
        static final int TRANSACTION_stop = 19;
        static final int TRANSACTION_unregisterCallbackListener = 4;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.support.v4.media.session.IMediaSession asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.v4.media.session.IMediaSession)) {
                return (android.support.v4.media.session.IMediaSession) queryLocalInterface;
            }
            return new android.support.v4.media.session.IMediaSession.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    sendCommand(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean sendMediaButton = sendMediaButton(parcel.readInt() != 0 ? (android.view.KeyEvent) android.view.KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(sendMediaButton ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isTransportControlEnabled = isTransportControlEnabled();
                    parcel2.writeNoException();
                    parcel2.writeInt(isTransportControlEnabled ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    java.lang.String packageName = getPackageName();
                    parcel2.writeNoException();
                    parcel2.writeString(packageName);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    java.lang.String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    android.app.PendingIntent launchPendingIntent = getLaunchPendingIntent();
                    parcel2.writeNoException();
                    if (launchPendingIntent != null) {
                        parcel2.writeInt(1);
                        launchPendingIntent.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    long flags = getFlags();
                    parcel2.writeNoException();
                    parcel2.writeLong(flags);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    android.support.v4.media.session.ParcelableVolumeInfo volumeAttributes = getVolumeAttributes();
                    parcel2.writeNoException();
                    if (volumeAttributes != null) {
                        parcel2.writeInt(1);
                        volumeAttributes.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    adjustVolume(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    setVolumeTo(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    play();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    playFromMediaId(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    playFromSearch(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    playFromUri(parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    skipToQueueItem(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    fastForward();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    rewind();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    seekTo(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    rate(parcel.readInt() != 0 ? android.support.v4.media.RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    sendCustomAction(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    android.support.v4.media.MediaMetadataCompat metadata = getMetadata();
                    parcel2.writeNoException();
                    if (metadata != null) {
                        parcel2.writeInt(1);
                        metadata.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    android.support.v4.media.session.PlaybackStateCompat playbackState = getPlaybackState();
                    parcel2.writeNoException();
                    if (playbackState != null) {
                        parcel2.writeInt(1);
                        playbackState.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> queue = getQueue();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(queue);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    java.lang.CharSequence queueTitle = getQueueTitle();
                    parcel2.writeNoException();
                    if (queueTitle != null) {
                        parcel2.writeInt(1);
                        android.text.TextUtils.writeToParcel(queueTitle, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    android.os.Bundle extras = getExtras();
                    parcel2.writeNoException();
                    if (extras != null) {
                        parcel2.writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    int ratingType = getRatingType();
                    parcel2.writeNoException();
                    parcel2.writeInt(ratingType);
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    prepare();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface(DESCRIPTOR);
                    prepareFromMediaId(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface(DESCRIPTOR);
                    prepareFromSearch(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface(DESCRIPTOR);
                    prepareFromUri(parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface(DESCRIPTOR);
                    int repeatMode = getRepeatMode();
                    parcel2.writeNoException();
                    parcel2.writeInt(repeatMode);
                    return true;
                case 38:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isShuffleModeEnabledRemoved = isShuffleModeEnabledRemoved();
                    parcel2.writeNoException();
                    parcel2.writeInt(isShuffleModeEnabledRemoved ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface(DESCRIPTOR);
                    setRepeatMode(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface(DESCRIPTOR);
                    setShuffleModeEnabledRemoved(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface(DESCRIPTOR);
                    addQueueItem(parcel.readInt() != 0 ? android.support.v4.media.MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface(DESCRIPTOR);
                    addQueueItemAt(parcel.readInt() != 0 ? android.support.v4.media.MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface(DESCRIPTOR);
                    removeQueueItem(parcel.readInt() != 0 ? android.support.v4.media.MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface(DESCRIPTOR);
                    removeQueueItemAt(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isCaptioningEnabled = isCaptioningEnabled();
                    parcel2.writeNoException();
                    parcel2.writeInt(isCaptioningEnabled ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCaptioningEnabled(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface(DESCRIPTOR);
                    int shuffleMode = getShuffleMode();
                    parcel2.writeNoException();
                    parcel2.writeInt(shuffleMode);
                    return true;
                case 48:
                    parcel.enforceInterface(DESCRIPTOR);
                    setShuffleMode(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlaybackSpeed(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface(DESCRIPTOR);
                    android.os.Bundle sessionInfo = getSessionInfo();
                    parcel2.writeNoException();
                    if (sessionInfo != null) {
                        parcel2.writeInt(1);
                        sessionInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface(DESCRIPTOR);
                    rateWithExtras(parcel.readInt() != 0 ? android.support.v4.media.RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements android.support.v4.media.session.IMediaSession {
            public static android.support.v4.media.session.IMediaSession sDefaultImpl;
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (resultReceiverWrapper != null) {
                        obtain.writeInt(1);
                        resultReceiverWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().sendCommand(str, bundle, resultReceiverWrapper);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(android.view.KeyEvent keyEvent) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().sendMediaButton(keyEvent);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iMediaControllerCallback != null ? iMediaControllerCallback.asBinder() : null);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().registerCallbackListener(iMediaControllerCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback iMediaControllerCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iMediaControllerCallback != null ? iMediaControllerCallback.asBinder() : null);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().unregisterCallbackListener(iMediaControllerCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().isTransportControlEnabled();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getPackageName() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getPackageName();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getTag() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getTag();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getLaunchPendingIntent();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (android.app.PendingIntent) android.app.PendingIntent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getFlags();
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getVolumeAttributes();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? android.support.v4.media.session.ParcelableVolumeInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int i, int i2, java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().adjustVolume(i, i2, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int i, int i2, java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().setVolumeTo(i, i2, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.MediaMetadataCompat getMetadata() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(27, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getMetadata();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? android.support.v4.media.MediaMetadataCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(28, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getPlaybackState();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? android.support.v4.media.session.PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(29, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getQueue();
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.CharSequence getQueueTitle() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(30, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getQueueTitle();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.os.Bundle getExtras() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(31, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getExtras();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(32, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getRatingType();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(45, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().isCaptioningEnabled();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(37, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getRepeatMode();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(38, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().isShuffleModeEnabledRemoved();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(47, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getShuffleMode();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(41, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().addQueueItem(mediaDescriptionCompat);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(42, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().addQueueItemAt(mediaDescriptionCompat, i);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(43, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().removeQueueItem(mediaDescriptionCompat);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int i) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(44, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().removeQueueItemAt(i);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.os.Bundle getSessionInfo() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(50, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        return android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().getSessionInfo();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(33, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().prepare();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(34, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().prepareFromMediaId(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(35, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().prepareFromSearch(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(36, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().prepareFromUri(uri, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().play();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().playFromMediaId(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().playFromSearch(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().playFromUri(uri, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long j) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeLong(j);
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().skipToQueueItem(j);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().pause();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().stop();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().next();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().previous();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(22, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().fastForward();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(23, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().rewind();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long j) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeLong(j);
                    if (!this.mRemote.transact(24, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().seekTo(j);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(android.support.v4.media.RatingCompat ratingCompat) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(25, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().rate(ratingCompat);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(51, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().rateWithExtras(ratingCompat, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setPlaybackSpeed(float f) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeFloat(f);
                    if (!this.mRemote.transact(49, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().setPlaybackSpeed(f);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(46, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().setCaptioningEnabled(z);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int i) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(39, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().setRepeatMode(i);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(40, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().setShuffleModeEnabledRemoved(z);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int i) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(48, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().setShuffleMode(i);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(android.support.v4.media.session.IMediaSession.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(26, obtain, obtain2, 0) && android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl() != null) {
                        android.support.v4.media.session.IMediaSession.Stub.getDefaultImpl().sendCustomAction(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(android.support.v4.media.session.IMediaSession iMediaSession) {
            if (android.support.v4.media.session.IMediaSession.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaSession == null) {
                return false;
            }
            android.support.v4.media.session.IMediaSession.Stub.Proxy.sDefaultImpl = iMediaSession;
            return true;
        }

        public static android.support.v4.media.session.IMediaSession getDefaultImpl() {
            return android.support.v4.media.session.IMediaSession.Stub.Proxy.sDefaultImpl;
        }
    }
}
