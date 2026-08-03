package com.inmobi.media;

/* renamed from: com.inmobi.media.dn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2364dn {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.inmobi.media.t9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0081 -> B:10:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(android.media.MediaPlayer mediaPlayer, java.util.ArrayList arrayList, com.inmobi.media.C2799u9 c2799u9, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Wm wm;
        int i;
        java.util.Iterator it;
        com.inmobi.media.C2799u9 c2799u92;
        if (continuationImpl instanceof com.inmobi.media.Wm) {
            wm = (com.inmobi.media.Wm) continuationImpl;
            int i2 = wm.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wm.f = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = wm.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = wm.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    a(mediaPlayer, c2799u9);
                    it = arrayList.iterator();
                    c2799u92 = c2799u9;
                    while (it.hasNext()) {
                    }
                    return com.inmobi.media.Qm.f4924a;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str = wm.d;
                it = wm.c;
                ?? r9 = wm.b;
                android.media.MediaPlayer mediaPlayer2 = wm.f5038a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.C2799u9 c2799u93 = r9;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return new com.inmobi.media.Um(str);
                }
                mediaPlayer = mediaPlayer2;
                c2799u92 = c2799u93;
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (android.webkit.URLUtil.isNetworkUrl(str2)) {
                        if (c2799u92 != null) {
                            c2799u92.a("VideoLoaderHelper", "Video Loading for URL: " + str2);
                        }
                        mediaPlayer.reset();
                        wm.f5038a = mediaPlayer;
                        wm.b = c2799u92;
                        wm.c = it;
                        wm.d = str2;
                        wm.f = 1;
                        java.lang.Object a2 = a(mediaPlayer, str2, c2799u92, wm);
                        if (a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mediaPlayer2 = mediaPlayer;
                        str = str2;
                        obj = a2;
                        c2799u93 = c2799u92;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                        }
                    }
                }
                return com.inmobi.media.Qm.f4924a;
            }
        }
        wm = new com.inmobi.media.Wm(continuationImpl);
        java.lang.Object obj2 = wm.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wm.f;
        if (i != 0) {
        }
    }

    public static final void a(android.media.MediaPlayer mediaPlayer, final com.inmobi.media.C2799u9 c2799u9) {
        mediaPlayer.setOnBufferingUpdateListener(new android.media.MediaPlayer.OnBufferingUpdateListener() { // from class: com.inmobi.media.dn$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(android.media.MediaPlayer mediaPlayer2, int i) {
                com.inmobi.media.AbstractC2364dn.a(com.inmobi.media.InterfaceC2772t9.this, mediaPlayer2, i);
            }
        });
    }

    public static final void a(com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, android.media.MediaPlayer mediaPlayer, int i) {
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("VideoLoaderHelper", "Buffering Percentage: " + i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0149 -> B:10:0x0150). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(androidx.media3.exoplayer.ExoPlayer exoPlayer, java.util.ArrayList arrayList, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, com.inmobi.media.L2 l2, boolean z, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Xm xm;
        int i;
        com.inmobi.media.L2 l22;
        boolean z2;
        java.util.Iterator it;
        com.inmobi.media.Xm xm2;
        int i2;
        androidx.media3.exoplayer.ExoPlayer exoPlayer2;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92;
        java.lang.Object m10798constructorimpl;
        if (continuationImpl instanceof com.inmobi.media.Xm) {
            xm = (com.inmobi.media.Xm) continuationImpl;
            int i3 = xm.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xm.j = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = xm.i;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = xm.j;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (arrayList.isEmpty()) {
                        if (interfaceC2772t9 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("VideoLoaderHelper", "No URLs provided to load media");
                        }
                        return new com.inmobi.media.C2428g8(com.inmobi.media.Rm.e);
                    }
                    java.util.List distinct = kotlin.collections.CollectionsKt.distinct(arrayList);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : distinct) {
                        java.lang.String str = (java.lang.String) obj2;
                        if (!kotlin.text.StringsKt.isBlank(str) && android.webkit.URLUtil.isNetworkUrl(str)) {
                            try {
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                m10798constructorimpl = kotlin.Result.m10798constructorimpl(new java.net.URI(str));
                            } catch (java.lang.Throwable th) {
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                            }
                            if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                                arrayList2.add(obj2);
                            }
                        }
                    }
                    if (arrayList2.size() != arrayList.size() && interfaceC2772t9 != null) {
                        ((com.inmobi.media.C2799u9) interfaceC2772t9).a("VideoLoaderHelper", "Filtered invalid or duplicate URLs. Valid set: " + arrayList2);
                    }
                    if (arrayList2.isEmpty()) {
                        if (interfaceC2772t9 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("VideoLoaderHelper", "All provided URLs were invalid or non-network");
                        }
                        return new com.inmobi.media.C2428g8(com.inmobi.media.Rm.c);
                    }
                    if (interfaceC2772t9 != null) {
                        ((com.inmobi.media.C2799u9) interfaceC2772t9).a("VideoLoaderHelper", "Attempting to load media from URLs: " + arrayList2);
                    }
                    java.util.Iterator it2 = arrayList2.iterator();
                    l22 = l2;
                    z2 = z;
                    it = it2;
                    xm2 = xm;
                    i2 = 0;
                    exoPlayer2 = exoPlayer;
                    interfaceC2772t92 = interfaceC2772t9;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = xm.h;
                    int i5 = xm.g;
                    boolean z3 = xm.f;
                    java.lang.String str2 = xm.e;
                    it = xm.d;
                    com.inmobi.media.L2 l23 = xm.c;
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = xm.b;
                    androidx.media3.exoplayer.ExoPlayer exoPlayer3 = xm.f5054a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    xm2 = xm;
                    interfaceC2772t92 = interfaceC2772t93;
                    int i6 = i5;
                    z2 = z3;
                    com.inmobi.media.AbstractC2480i8 abstractC2480i8 = (com.inmobi.media.AbstractC2480i8) obj;
                    if (abstractC2480i8 instanceof com.inmobi.media.C2505j8) {
                        if (interfaceC2772t92 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t92).b("VideoLoaderHelper", "Failed to load media from URL (" + i4 + "): " + str2);
                        }
                        l22 = l23;
                        i2 = i6;
                        exoPlayer2 = exoPlayer3;
                        if (!it.hasNext()) {
                            java.lang.Object next = it.next();
                            i6 = i2 + 1;
                            if (i2 < 0) {
                                kotlin.collections.CollectionsKt.throwIndexOverflow();
                            }
                            java.lang.String str3 = (java.lang.String) next;
                            xm2.f5054a = exoPlayer2;
                            xm2.b = interfaceC2772t92;
                            xm2.c = l22;
                            xm2.d = it;
                            xm2.e = str3;
                            xm2.f = z2;
                            xm2.g = i6;
                            xm2.h = i2;
                            xm2.j = 1;
                            java.lang.Object a2 = a(exoPlayer2, str3, interfaceC2772t92, l22, z2, xm2);
                            if (a2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            exoPlayer3 = exoPlayer2;
                            obj = a2;
                            l23 = l22;
                            i4 = i2;
                            str2 = str3;
                            com.inmobi.media.AbstractC2480i8 abstractC2480i82 = (com.inmobi.media.AbstractC2480i8) obj;
                            if (abstractC2480i82 instanceof com.inmobi.media.C2505j8) {
                                if (interfaceC2772t92 != null) {
                                    ((com.inmobi.media.C2799u9) interfaceC2772t92).a("VideoLoaderHelper", "Successfully loaded media from URL: " + str2);
                                }
                                return abstractC2480i82;
                            }
                        } else {
                            if (interfaceC2772t92 != null) {
                                ((com.inmobi.media.C2799u9) interfaceC2772t92).b("VideoLoaderHelper", "All URLs failed to load");
                            }
                            return new com.inmobi.media.C2428g8(com.inmobi.media.Rm.d);
                        }
                    }
                }
            }
        }
        xm = new com.inmobi.media.Xm(continuationImpl);
        java.lang.Object obj3 = xm.i;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = xm.j;
        if (i != 0) {
        }
    }

    public static final java.lang.Object a(android.media.MediaPlayer mediaPlayer, java.lang.String str, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, com.inmobi.media.Wm wm) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(wm), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new com.inmobi.media.Ym(mediaPlayer));
        try {
            mediaPlayer.setOnPreparedListener(new com.inmobi.media.Zm(interfaceC2772t9, str, cancellableContinuationImpl));
            mediaPlayer.setOnErrorListener(new com.inmobi.media.C2284an(interfaceC2772t9, str, cancellableContinuationImpl));
            mediaPlayer.setDataSource(str);
            mediaPlayer.prepareAsync();
        } catch (java.io.IOException e) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("VideoLoaderHelper", "Video Load Exception: " + e.getMessage());
            }
            com.inmobi.media.T4.a(cancellableContinuationImpl, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        } catch (java.lang.IllegalStateException e2) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("VideoLoaderHelper", "Video Load Exception: " + e2.getMessage());
            }
            com.inmobi.media.T4.a(cancellableContinuationImpl, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(wm);
        }
        return result;
    }

    public static final java.lang.Object a(androidx.media3.exoplayer.ExoPlayer exoPlayer, java.lang.String str, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, com.inmobi.media.L2 l2, boolean z, com.inmobi.media.Xm xm) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(xm), 1);
        cancellableContinuationImpl.initCancellability();
        com.inmobi.media.C2338cn c2338cn = new com.inmobi.media.C2338cn(cancellableContinuationImpl, l2, str, interfaceC2772t9, exoPlayer);
        cancellableContinuationImpl.invokeOnCancellation(new com.inmobi.media.C2310bn(exoPlayer, c2338cn));
        if (interfaceC2772t9 != null) {
            try {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("VideoLoaderHelper", "Trying URL with cache " + z + ": " + str);
            } catch (java.lang.Exception e) {
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).b("VideoLoaderHelper", "Exception during media source preparation for URL (" + str + "): " + e.getMessage());
                }
                exoPlayer.removeListener(c2338cn);
                if (cancellableContinuationImpl.isActive()) {
                    com.inmobi.media.T4.a(cancellableContinuationImpl, new com.inmobi.media.C2428g8(com.inmobi.media.Rm.b));
                }
                exoPlayer.stop();
                exoPlayer.clearMediaItems();
            }
        }
        androidx.media3.exoplayer.source.MediaSource a2 = l2.a(str, z);
        exoPlayer.addListener(c2338cn);
        exoPlayer.setMediaSource(a2);
        exoPlayer.prepare();
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(xm);
        }
        return result;
    }
}
