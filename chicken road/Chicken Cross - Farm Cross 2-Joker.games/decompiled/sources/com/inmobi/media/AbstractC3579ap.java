package com.inmobi.media;

import android.media.MediaPlayer;
import android.webkit.URLUtil;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: com.inmobi.media.ap, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3579ap {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.inmobi.media.Y9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0082 -> B:10:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(MediaPlayer mediaPlayer, ArrayList arrayList, Z9 z9, ContinuationImpl continuationImpl) {
        To to;
        int i;
        Iterator it;
        Z9 z92;
        if (continuationImpl instanceof To) {
            to = (To) continuationImpl;
            int i2 = to.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                to.f = i2 - Integer.MIN_VALUE;
                Object obj = to.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = to.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    a(mediaPlayer, z9);
                    it = arrayList.iterator();
                    z92 = z9;
                    while (it.hasNext()) {
                    }
                    return No.f6750a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = to.d;
                it = to.c;
                ?? r9 = to.b;
                MediaPlayer mediaPlayer2 = to.f6878a;
                ResultKt.throwOnFailure(obj);
                Z9 z93 = r9;
                if (!((Boolean) obj).booleanValue()) {
                    return new Ro(str);
                }
                mediaPlayer = mediaPlayer2;
                z92 = z93;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (URLUtil.isNetworkUrl(str2)) {
                        if (z92 != null) {
                            z92.a("VideoLoaderHelper", "Video Loading for URL: " + str2);
                        }
                        mediaPlayer.reset();
                        to.f6878a = mediaPlayer;
                        to.b = z92;
                        to.c = it;
                        to.d = str2;
                        to.f = 1;
                        Object a2 = a(mediaPlayer, str2, z92, to);
                        if (a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mediaPlayer2 = mediaPlayer;
                        str = str2;
                        obj = a2;
                        z93 = z92;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                }
                return No.f6750a;
            }
        }
        to = new To(continuationImpl);
        Object obj2 = to.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = to.f;
        if (i != 0) {
        }
    }

    public static final void a(MediaPlayer mediaPlayer, final Z9 z9) {
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: com.inmobi.media.ap$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i) {
                AbstractC3579ap.a(Y9.this, mediaPlayer2, i);
            }
        });
    }

    public static final void a(Y9 y9, MediaPlayer mediaPlayer, int i) {
        if (y9 != null) {
            ((Z9) y9).a("VideoLoaderHelper", "Buffering Percentage: " + i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x014b -> B:10:0x0152). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ExoPlayer exoPlayer, ArrayList arrayList, Y9 y9, C3783i3 c3783i3, boolean z, ContinuationImpl continuationImpl) {
        Uo uo;
        int i;
        C3783i3 c3783i32;
        boolean z2;
        Iterator it;
        int i2;
        ExoPlayer exoPlayer2;
        Uo uo2;
        Y9 y92;
        Object m8079constructorimpl;
        if (continuationImpl instanceof Uo) {
            uo = (Uo) continuationImpl;
            int i3 = uo.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uo.j = i3 - Integer.MIN_VALUE;
                Object obj = uo.i;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = uo.j;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (arrayList.isEmpty()) {
                        if (y9 != null) {
                            ((Z9) y9).b("VideoLoaderHelper", "No URLs provided to load media");
                        }
                        return new I8(Oo.e);
                    }
                    List distinct = CollectionsKt.distinct(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = distinct.iterator();
                    while (true) {
                        boolean z3 = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        String str = (String) next;
                        if (!StringsKt.isBlank(str) && URLUtil.isNetworkUrl(str)) {
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(new URI(str));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                            }
                            z3 = Result.m8086isSuccessimpl(m8079constructorimpl);
                        }
                        if (z3) {
                            arrayList2.add(next);
                        }
                    }
                    if (arrayList2.size() != arrayList.size() && y9 != null) {
                        ((Z9) y9).a("VideoLoaderHelper", "Filtered invalid or duplicate URLs. Valid set: " + arrayList2);
                    }
                    if (arrayList2.isEmpty()) {
                        if (y9 != null) {
                            ((Z9) y9).b("VideoLoaderHelper", "All provided URLs were invalid or non-network");
                        }
                        return new I8(Oo.c);
                    }
                    if (y9 != null) {
                        ((Z9) y9).a("VideoLoaderHelper", "Attempting to load media from URLs: " + arrayList2);
                    }
                    Iterator it3 = arrayList2.iterator();
                    c3783i32 = c3783i3;
                    z2 = z;
                    it = it3;
                    i2 = 0;
                    exoPlayer2 = exoPlayer;
                    uo2 = uo;
                    y92 = y9;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = uo.h;
                    int i5 = uo.g;
                    boolean z4 = uo.f;
                    String str2 = uo.e;
                    it = uo.d;
                    C3783i3 c3783i33 = uo.c;
                    Y9 y93 = uo.b;
                    ExoPlayer exoPlayer3 = uo.f6900a;
                    ResultKt.throwOnFailure(obj);
                    uo2 = uo;
                    y92 = y93;
                    int i6 = i5;
                    z2 = z4;
                    K8 k8 = (K8) obj;
                    if (k8 instanceof L8) {
                        if (y92 != null) {
                            ((Z9) y92).b("VideoLoaderHelper", "Failed to load media from URL (" + i4 + "): " + str2);
                        }
                        c3783i32 = c3783i33;
                        i2 = i6;
                        exoPlayer2 = exoPlayer3;
                        if (!it.hasNext()) {
                            Object next2 = it.next();
                            i6 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            String str3 = (String) next2;
                            uo2.f6900a = exoPlayer2;
                            uo2.b = y92;
                            uo2.c = c3783i32;
                            uo2.d = it;
                            uo2.e = str3;
                            uo2.f = z2;
                            uo2.g = i6;
                            uo2.h = i2;
                            uo2.j = 1;
                            Object a2 = a(exoPlayer2, str3, y92, c3783i32, z2, uo2);
                            if (a2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            exoPlayer3 = exoPlayer2;
                            obj = a2;
                            c3783i33 = c3783i32;
                            i4 = i2;
                            str2 = str3;
                            K8 k82 = (K8) obj;
                            if (k82 instanceof L8) {
                                if (y92 != null) {
                                    ((Z9) y92).a("VideoLoaderHelper", "Successfully loaded media from URL: " + str2);
                                }
                                return k82;
                            }
                        } else {
                            if (y92 != null) {
                                ((Z9) y92).b("VideoLoaderHelper", "All URLs failed to load");
                            }
                            return new I8(Oo.d);
                        }
                    }
                }
            }
        }
        uo = new Uo(continuationImpl);
        Object obj2 = uo.i;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = uo.j;
        if (i != 0) {
        }
    }

    public static final Object a(MediaPlayer mediaPlayer, String str, Y9 y9, To to) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(to), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new Vo(mediaPlayer));
        try {
            mediaPlayer.setOnPreparedListener(new Wo(y9, str, cancellableContinuationImpl));
            mediaPlayer.setOnErrorListener(new Xo(y9, str, cancellableContinuationImpl));
            mediaPlayer.setDataSource(str);
            mediaPlayer.prepareAsync();
        } catch (IOException e) {
            if (y9 != null) {
                ((Z9) y9).b("VideoLoaderHelper", "Video Load Exception: " + e.getMessage());
            }
            AbstractC4012q5.a(cancellableContinuationImpl, Boxing.boxBoolean(false));
        } catch (IllegalStateException e2) {
            if (y9 != null) {
                ((Z9) y9).b("VideoLoaderHelper", "Video Load Exception: " + e2.getMessage());
            }
            AbstractC4012q5.a(cancellableContinuationImpl, Boxing.boxBoolean(false));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(to);
        }
        return result;
    }

    public static final Object a(ExoPlayer exoPlayer, String str, Y9 y9, C3783i3 c3783i3, boolean z, Uo uo) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uo), 1);
        cancellableContinuationImpl.initCancellability();
        Zo zo = new Zo(cancellableContinuationImpl, c3783i3, str, y9, exoPlayer);
        cancellableContinuationImpl.invokeOnCancellation(new Yo(exoPlayer, zo));
        if (y9 != null) {
            try {
                ((Z9) y9).a("VideoLoaderHelper", "Trying URL with cache " + z + ": " + str);
            } catch (Exception e) {
                if (y9 != null) {
                    ((Z9) y9).b("VideoLoaderHelper", "Exception during media source preparation for URL (" + str + "): " + e.getMessage());
                }
                exoPlayer.removeListener(zo);
                if (cancellableContinuationImpl.isActive()) {
                    AbstractC4012q5.a(cancellableContinuationImpl, new I8(Oo.b));
                }
                exoPlayer.stop();
                exoPlayer.clearMediaItems();
            }
        }
        MediaSource a2 = c3783i3.a(str, z);
        exoPlayer.addListener(zo);
        exoPlayer.setMediaSource(a2);
        exoPlayer.prepare();
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(uo);
        }
        return result;
    }
}
