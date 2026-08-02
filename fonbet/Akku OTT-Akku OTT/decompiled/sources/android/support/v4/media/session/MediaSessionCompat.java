package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.MediaDescription;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import androidx.media.MediaSessionManager;
import androidx.media.session.MediaButtonReceiver;
import androidx.versionedparcelable.ParcelUtils;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class MediaSessionCompat {
    public static int d;
    public final d a;
    public final MediaControllerCompat b;
    public final ArrayList<g> c = new ArrayList<>();

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        public ResultReceiver a;

        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                ResultReceiverWrapper resultReceiverWrapper = new ResultReceiverWrapper();
                resultReceiverWrapper.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return resultReceiverWrapper;
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        public final Object b;

        @GuardedBy("mLock")
        public android.support.v4.media.session.b c;
        public final Object a = new Object();

        @GuardedBy("mLock")
        public VersionedParcelable d = null;

        public class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj, android.support.v4.media.session.b bVar) {
            this.b = obj;
            this.c = bVar;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Token h(Parcelable parcelable, android.support.v4.media.session.b bVar) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof MediaSession.Token) {
                return new Token(parcelable, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.b;
            if (obj2 == null) {
                return token.b == null;
            }
            Object obj3 = token.b;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public final int hashCode() {
            Object obj = this.b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final android.support.v4.media.session.b l() {
            android.support.v4.media.session.b bVar;
            synchronized (this.a) {
                bVar = this.c;
            }
            return bVar;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.b, i);
        }
    }

    public static abstract class a {
        public boolean c;

        @GuardedBy("mLock")
        public HandlerC0016a e;
        public final Object a = new Object();
        public final b b = new b();

        @GuardedBy("mLock")
        public WeakReference<b> d = new WeakReference<>(null);

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a, reason: collision with other inner class name */
        public class HandlerC0016a extends Handler {
            public HandlerC0016a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                b bVar;
                a aVar;
                HandlerC0016a handlerC0016a;
                if (message.what == 1) {
                    synchronized (a.this.a) {
                        bVar = a.this.d.get();
                        aVar = a.this;
                        handlerC0016a = aVar.e;
                    }
                    if (bVar == null || aVar != bVar.getCallback() || handlerC0016a == null) {
                        return;
                    }
                    bVar.a((MediaSessionManager.RemoteUserInfo) message.obj);
                    a aVar2 = a.this;
                    if (aVar2.c) {
                        aVar2.c = false;
                        handlerC0016a.removeMessages(1);
                        bVar.getPlaybackState();
                    }
                    bVar.a(null);
                }
            }
        }

        @RequiresApi(21)
        public class b extends MediaSession.Callback {
            public b() {
            }

            public static void b(c cVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                MediaSession mediaSession = cVar.a;
                String str = null;
                try {
                    str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
                } catch (Exception unused) {
                }
                if (TextUtils.isEmpty(str)) {
                    str = "android.media.session.MediaController";
                }
                cVar.a(new MediaSessionManager.RemoteUserInfo(str, -1, -1));
            }

            public final c a() {
                c cVar;
                synchronized (a.this.a) {
                    cVar = (c) a.this.d.get();
                }
                if (cVar == null || a.this != cVar.getCallback()) {
                    return null;
                }
                return cVar;
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                VersionedParcelable versionedParcelable;
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                try {
                    if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                        Bundle bundle2 = new Bundle();
                        Token token = a.c;
                        android.support.v4.media.session.b l = token.l();
                        BundleCompat.putBinder(bundle2, androidx.media3.session.legacy.MediaSessionCompat.KEY_EXTRA_BINDER, l == null ? null : l.asBinder());
                        synchronized (token.a) {
                            versionedParcelable = token.d;
                        }
                        ParcelUtils.putVersionedParcelable(bundle2, androidx.media3.session.legacy.MediaSessionCompat.KEY_SESSION2_TOKEN, versionedParcelable);
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                    } else if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                        bundle.getInt(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ARGUMENT_INDEX);
                    } else if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                    } else {
                        str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT);
                    }
                } catch (BadParcelableException unused) {
                }
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCustomAction(String str, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                try {
                    if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PLAY_FROM_URI)) {
                        MediaSessionCompat.a(bundle.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                    } else if (!str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE)) {
                        if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                            bundle.getString(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);
                            MediaSessionCompat.a(bundle.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                        } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                            bundle.getString(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_QUERY);
                            MediaSessionCompat.a(bundle.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                        } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                            MediaSessionCompat.a(bundle.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                        } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                            bundle.getBoolean(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED);
                        } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                            bundle.getInt(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE);
                        } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                            bundle.getInt(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE);
                        } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_RATING)) {
                            MediaSessionCompat.a(bundle.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                        } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                            bundle.getFloat(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f);
                        }
                    }
                } catch (BadParcelableException unused) {
                }
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onFastForward() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final boolean onMediaButtonEvent(Intent intent) {
                b bVar;
                HandlerC0016a handlerC0016a;
                KeyEvent keyEvent;
                c a = a();
                if (a == null) {
                    return false;
                }
                b(a);
                a aVar = a.this;
                boolean z = false;
                if (Build.VERSION.SDK_INT >= 27) {
                    aVar.getClass();
                } else {
                    synchronized (aVar.a) {
                        bVar = aVar.d.get();
                        handlerC0016a = aVar.e;
                    }
                    if (bVar != null && handlerC0016a != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                        MediaSessionManager.RemoteUserInfo currentControllerInfo = bVar.getCurrentControllerInfo();
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 79 || keyCode == 85) {
                            if (keyEvent.getRepeatCount() == 0) {
                                if (aVar.c) {
                                    handlerC0016a.removeMessages(1);
                                    aVar.c = false;
                                    bVar.getPlaybackState();
                                } else {
                                    aVar.c = true;
                                    handlerC0016a.sendMessageDelayed(handlerC0016a.obtainMessage(1, currentControllerInfo), ViewConfiguration.getDoubleTapTimeout());
                                }
                            } else if (aVar.c) {
                                aVar.c = false;
                                handlerC0016a.removeMessages(1);
                                bVar.getPlaybackState();
                            }
                            z = true;
                        } else if (aVar.c) {
                            aVar.c = false;
                            handlerC0016a.removeMessages(1);
                            bVar.getPlaybackState();
                        }
                    }
                }
                a.a(null);
                return z || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPause() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlay() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromMediaId(String str, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromSearch(String str, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(23)
            public final void onPlayFromUri(Uri uri, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(24)
            public final void onPrepare() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(24)
            public final void onPrepareFromMediaId(String str, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(24)
            public final void onPrepareFromSearch(String str, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(24)
            public final void onPrepareFromUri(Uri uri, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onRewind() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSeekTo(long j) {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.a(j);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi(29)
            public final void onSetPlaybackSpeed(float f) {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetRating(Rating rating) {
                float f;
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                if (rating != null) {
                    int b = RatingCompat.b.b(rating);
                    RatingCompat ratingCompat = null;
                    if (!RatingCompat.b.e(rating)) {
                        switch (b) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                ratingCompat = new RatingCompat(b, -1.0f);
                                break;
                        }
                    } else {
                        switch (b) {
                            case 1:
                                ratingCompat = new RatingCompat(1, RatingCompat.b.d(rating) ? 1.0f : 0.0f);
                                break;
                            case 2:
                                ratingCompat = new RatingCompat(2, RatingCompat.b.f(rating) ? 1.0f : 0.0f);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                float c = RatingCompat.b.c(rating);
                                if (b == 3) {
                                    f = 3.0f;
                                } else if (b == 4) {
                                    f = 4.0f;
                                } else if (b == 5) {
                                    f = 5.0f;
                                }
                                if (c >= 0.0f && c <= f) {
                                    ratingCompat = new RatingCompat(b, c);
                                    break;
                                }
                                break;
                            case 6:
                                float a2 = RatingCompat.b.a(rating);
                                if (a2 >= 0.0f && a2 <= 100.0f) {
                                    ratingCompat = new RatingCompat(6, a2);
                                    break;
                                }
                                break;
                        }
                    }
                    ratingCompat.getClass();
                }
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToNext() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToPrevious() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToQueueItem(long j) {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onStop() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.a(null);
            }
        }

        public void a(long j) {
        }
    }

    public interface b {
        void a(MediaSessionManager.RemoteUserInfo remoteUserInfo);

        a getCallback();

        MediaSessionManager.RemoteUserInfo getCurrentControllerInfo();

        PlaybackStateCompat getPlaybackState();
    }

    @RequiresApi(22)
    public static class d extends c {
    }

    @RequiresApi(28)
    public static class e extends d {
        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.b
        public final void a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.b
        @NonNull
        public final MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
            MediaSessionManager.RemoteUserInfo currentControllerInfo;
            currentControllerInfo = this.a.getCurrentControllerInfo();
            return new MediaSessionManager.RemoteUserInfo(currentControllerInfo);
        }
    }

    @RequiresApi(29)
    public static class f extends e {
        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public final MediaSession b(Context context) {
            return android.support.v4.media.session.e.d(context);
        }
    }

    public interface g {
        void a();
    }

    public MediaSessionCompat(@NonNull Context context, @Nullable PendingIntent pendingIntent) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty("BetterPlayer")) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        ComponentName mediaButtonReceiverComponent = MediaButtonReceiver.getMediaButtonReceiverComponent(context);
        if (mediaButtonReceiverComponent != null && pendingIntent == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(mediaButtonReceiverComponent);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.a = new f(context);
        } else if (i >= 28) {
            this.a = new e(context);
        } else {
            this.a = new d(context);
        }
        this.a.c(new android.support.v4.media.session.c(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.a.a.setMediaButtonReceiver(pendingIntent);
        this.b = new MediaControllerCompat(context, this.a.c);
        if (d == 0) {
            d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void a(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public final void b() {
        d dVar = this.a;
        MediaSession mediaSession = dVar.a;
        dVar.e.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception unused) {
            }
        }
        mediaSession.setCallback(null);
        dVar.b.b.set(null);
        mediaSession.release();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        public final MediaDescriptionCompat a;
        public final long b;

        public class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        @RequiresApi(21)
        public static class b {
            @DoNotInline
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            @DoNotInline
            public static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            @DoNotInline
            public static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.a = mediaDescriptionCompat;
            this.b = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.a);
            sb.append(", Id=");
            return android.support.v4.media.session.f.c(sb, this.b, " }");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
            parcel.writeLong(this.b);
        }

        public QueueItem(Parcel parcel) {
            this.a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.b = parcel.readLong();
        }
    }

    @RequiresApi(21)
    public static class c implements b {
        public final MediaSession a;
        public final a b;
        public final Token c;
        public final Object d = new Object();
        public final RemoteCallbackList<android.support.v4.media.session.a> e = new RemoteCallbackList<>();
        public PlaybackStateCompat f;
        public MediaMetadataCompat g;

        @GuardedBy("mLock")
        public a h;

        @GuardedBy("mLock")
        public MediaSessionManager.RemoteUserInfo i;

        public c(Context context) {
            MediaSession b = b(context);
            this.a = b;
            a aVar = new a((d) this);
            this.b = aVar;
            this.c = new Token(b.getSessionToken(), aVar);
            b.setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            synchronized (this.d) {
                this.i = remoteUserInfo;
            }
        }

        public MediaSession b(Context context) {
            return new MediaSession(context, "BetterPlayer");
        }

        public final void c(a aVar, Handler handler) {
            synchronized (this.d) {
                this.h = aVar;
                this.a.setCallback(aVar == null ? null : aVar.b, handler);
                if (aVar != null) {
                    synchronized (aVar.a) {
                        try {
                            aVar.d = new WeakReference<>(this);
                            a.HandlerC0016a handlerC0016a = aVar.e;
                            a.HandlerC0016a handlerC0016a2 = null;
                            if (handlerC0016a != null) {
                                handlerC0016a.removeCallbacksAndMessages(null);
                            }
                            if (handler != null) {
                                handlerC0016a2 = aVar.new HandlerC0016a(handler.getLooper());
                            }
                            aVar.e = handlerC0016a2;
                        } finally {
                        }
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final a getCallback() {
            a aVar;
            synchronized (this.d) {
                aVar = this.h;
            }
            return aVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
            MediaSessionManager.RemoteUserInfo remoteUserInfo;
            synchronized (this.d) {
                remoteUserInfo = this.i;
            }
            return remoteUserInfo;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final PlaybackStateCompat getPlaybackState() {
            return this.f;
        }

        public static class a extends b.a {
            public final AtomicReference<c> b;

            public a(@NonNull d dVar) {
                attachInterface(this, "android.support.v4.media.session.IMediaSession");
                this.b = new AtomicReference<>(dVar);
            }

            @Override // android.support.v4.media.session.b
            public final void adjustVolume(int i, int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void e(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void f(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void fastForward() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final long getFlags() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final PendingIntent getLaunchPendingIntent() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final PlaybackStateCompat getPlaybackState() {
                c cVar = this.b.get();
                if (cVar == null) {
                    return null;
                }
                PlaybackStateCompat playbackStateCompat = cVar.f;
                MediaMetadataCompat mediaMetadataCompat = cVar.g;
                if (playbackStateCompat == null) {
                    return playbackStateCompat;
                }
                float f = playbackStateCompat.d;
                long j = playbackStateCompat.j;
                int i = playbackStateCompat.a;
                long j2 = playbackStateCompat.b;
                long j3 = -1;
                if (j2 == -1) {
                    return playbackStateCompat;
                }
                if ((i != 3 && i != 4 && i != 5) || j <= 0) {
                    return playbackStateCompat;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = ((long) (f * (elapsedRealtime - j))) + j2;
                if (mediaMetadataCompat != null) {
                    Bundle bundle = mediaMetadataCompat.a;
                    if (bundle.containsKey(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION)) {
                        j3 = bundle.getLong(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION, 0L);
                    }
                }
                long j5 = (j3 < 0 || j4 <= j3) ? j4 < 0 ? 0L : j4 : j3;
                ArrayList arrayList = new ArrayList();
                long j6 = playbackStateCompat.c;
                long j7 = playbackStateCompat.e;
                int i2 = playbackStateCompat.f;
                CharSequence charSequence = playbackStateCompat.i;
                ArrayList arrayList2 = playbackStateCompat.k;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                return new PlaybackStateCompat(playbackStateCompat.a, j5, j6, playbackStateCompat.d, j7, i2, charSequence, elapsedRealtime, arrayList, playbackStateCompat.l, playbackStateCompat.m);
            }

            @Override // android.support.v4.media.session.b
            public final CharSequence getQueueTitle() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void getRatingType() {
                this.b.get();
            }

            @Override // android.support.v4.media.session.b
            public final int getRepeatMode() {
                return this.b.get() != null ? 0 : -1;
            }

            @Override // android.support.v4.media.session.b
            public final Bundle getSessionInfo() {
                this.b.get().getClass();
                return null;
            }

            @Override // android.support.v4.media.session.b
            public final int getShuffleMode() {
                return this.b.get() != null ? 0 : -1;
            }

            @Override // android.support.v4.media.session.b
            public final String getTag() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final ParcelableVolumeInfo getVolumeAttributes() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void i(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void isCaptioningEnabled() {
                this.b.get();
            }

            @Override // android.support.v4.media.session.b
            public final boolean isTransportControlEnabled() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void o(android.support.v4.media.session.a aVar) {
                c cVar = this.b.get();
                if (cVar == null) {
                    return;
                }
                cVar.e.register(aVar, new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (cVar.d) {
                }
            }

            @Override // android.support.v4.media.session.b
            public final void p(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void play() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void playFromMediaId(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void playFromSearch(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void playFromUri(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void prepare() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void prepareFromMediaId(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void prepareFromSearch(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void prepareFromUri(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void q(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void r(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void removeQueueItemAt(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void rewind() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void s(android.support.v4.media.session.a aVar) {
                c cVar = this.b.get();
                if (cVar == null) {
                    return;
                }
                cVar.e.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (cVar.d) {
                }
            }

            @Override // android.support.v4.media.session.b
            public final void seekTo(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void sendCustomAction(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final boolean sendMediaButton(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void setCaptioningEnabled(boolean z) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void setPlaybackSpeed(float f) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void setRepeatMode(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void setShuffleMode(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void setVolumeTo(int i, int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void skipToQueueItem(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void getQueue() {
            }
        }
    }
}
