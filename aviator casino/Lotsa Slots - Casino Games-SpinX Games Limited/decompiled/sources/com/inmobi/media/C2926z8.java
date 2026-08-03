package com.inmobi.media;

/* renamed from: com.inmobi.media.z8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2926z8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest f5586a;
    public final com.inmobi.media.C2936zi b;
    public final com.inmobi.media.InterfaceC2772t9 c;
    public final kotlinx.coroutines.CoroutineScope d;
    public final kotlinx.coroutines.CoroutineScope e;
    public kotlinx.coroutines.Job f;
    public final java.util.concurrent.atomic.AtomicBoolean g;
    public final java.lang.ref.WeakReference h;
    public boolean i;
    public final com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig j;
    public final com.inmobi.media.R7 k;
    public boolean l;
    public com.inmobi.media.C2464hi m;
    public com.inmobi.media.C2622ni n;
    public boolean o;
    public com.inmobi.media.Gf p;
    public final java.util.concurrent.atomic.AtomicReference q;

    public C2926z8(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, com.inmobi.media.core.config.models.AdConfig.HybridNativeConfig hybridNativeConfig, com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest videoRequestConfig, com.inmobi.media.C2622ni c2622ni, com.inmobi.media.C2936zi c2936zi, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoRequestConfig, "videoRequestConfig");
        this.f5586a = videoRequestConfig;
        this.b = c2936zi;
        this.c = interfaceC2772t9;
        com.inmobi.media.C2901y8 c2901y8 = new com.inmobi.media.C2901y8(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE, this);
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(c2901y8));
        this.d = CoroutineScope;
        this.e = com.inmobi.media.T4.a(CoroutineScope, c2901y8);
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = new java.lang.ref.WeakReference(renderView.getContext());
        this.j = videoRequestConfig.getConfig();
        android.content.Context context = renderView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.k = new com.inmobi.media.R7(context, hybridNativeConfig, CoroutineScope, videoRequestConfig, interfaceC2772t9);
        this.n = c2622ni;
        this.q = new java.util.concurrent.atomic.AtomicReference(com.inmobi.media.EnumC2850w8.f5524a);
    }

    public static /* synthetic */ boolean a(com.inmobi.media.C2926z8 c2926z8, com.inmobi.media.EnumC2850w8[] enumC2850w8Arr, java.lang.String str, java.lang.String str2, com.inmobi.media.EnumC2850w8 enumC2850w8, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            enumC2850w8 = null;
        }
        return c2926z8.a(enumC2850w8Arr, str, str2, enumC2850w8);
    }

    public final void b(boolean z) {
        if (this.g.get()) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", z ? com.ironsource.C3232q2.v : "hide");
        com.inmobi.media.EnumC2850w8[] enumC2850w8Arr = {com.inmobi.media.EnumC2850w8.c, com.inmobi.media.EnumC2850w8.e, com.inmobi.media.EnumC2850w8.f, com.inmobi.media.EnumC2850w8.g, com.inmobi.media.EnumC2850w8.h};
        com.inmobi.media.EnumC2374e8[] enumC2374e8Arr = com.inmobi.media.EnumC2374e8.f5173a;
        if (a(this, enumC2850w8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            com.inmobi.media.R7 r7 = this.k;
            if (r7.h.get()) {
                return;
            }
            if (z) {
                r7.e();
            } else {
                r7.f();
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                r7.n.setVisibility(z ? 0 : 8);
            } else {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r7.c, null, null, new com.inmobi.media.C7(null, r7, z), 3, null);
            }
        }
    }

    public final boolean a(com.inmobi.media.EnumC2850w8[] enumC2850w8Arr, java.lang.String str, java.lang.String str2, com.inmobi.media.EnumC2850w8 enumC2850w8) {
        com.inmobi.media.EnumC2850w8 enumC2850w82 = (com.inmobi.media.EnumC2850w8) this.q.get();
        boolean z = false;
        if (kotlin.collections.ArraysKt.contains(enumC2850w8Arr, enumC2850w82)) {
            if (enumC2850w8 != null && !a(enumC2850w8, str, str2)) {
                z = true;
            }
            return !z;
        }
        if (str != null) {
            java.lang.String format = java.lang.String.format("Invalid state (%s) for %s. Allowed: %s", java.util.Arrays.copyOf(new java.lang.Object[]{enumC2850w82, str2, kotlin.collections.ArraysKt.joinToString$default(enumC2850w8Arr, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 63, (java.lang.Object) null)}, 3));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            a(str, format, str2);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r7 == com.inmobi.media.EnumC2850w8.i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r7 != com.inmobi.media.EnumC2850w8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        if (r7 != com.inmobi.media.EnumC2850w8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004c, code lost:
    
        if (r7 != com.inmobi.media.EnumC2850w8.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0052, code lost:
    
        if (r7 == com.inmobi.media.EnumC2850w8.i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0063, code lost:
    
        if (r7 != com.inmobi.media.EnumC2850w8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0074, code lost:
    
        if (r7 != com.inmobi.media.EnumC2850w8.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007d, code lost:
    
        if (r7 != com.inmobi.media.EnumC2850w8.i) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(com.inmobi.media.EnumC2850w8 enumC2850w8, java.lang.String str, java.lang.String str2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9;
        com.inmobi.media.EnumC2850w8 enumC2850w82 = (com.inmobi.media.EnumC2850w8) this.q.get();
        if (enumC2850w82 == enumC2850w8) {
            return true;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(enumC2850w82);
        switch (enumC2850w82.ordinal()) {
            case 0:
                if (enumC2850w8 != com.inmobi.media.EnumC2850w8.b) {
                    break;
                }
                interfaceC2772t9 = this.c;
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).a("HybridVideoPlayerHandler", "State transition: " + enumC2850w82 + " -> " + enumC2850w8 + " (cause=" + str2 + ")");
                }
                this.q.set(enumC2850w8);
                return true;
            case 1:
                if (enumC2850w8 != com.inmobi.media.EnumC2850w8.c) {
                    if (enumC2850w8 != com.inmobi.media.EnumC2850w8.d) {
                        if (enumC2850w8 != com.inmobi.media.EnumC2850w8.h) {
                            break;
                        }
                    }
                }
                interfaceC2772t9 = this.c;
                if (interfaceC2772t9 != null) {
                }
                this.q.set(enumC2850w8);
                return true;
            case 2:
                if (enumC2850w8 != com.inmobi.media.EnumC2850w8.e) {
                    if (enumC2850w8 != com.inmobi.media.EnumC2850w8.f) {
                        if (enumC2850w8 != com.inmobi.media.EnumC2850w8.i) {
                            break;
                        }
                    }
                }
                interfaceC2772t9 = this.c;
                if (interfaceC2772t9 != null) {
                }
                this.q.set(enumC2850w8);
                return true;
            case 3:
                break;
            case 4:
                if (enumC2850w8 != com.inmobi.media.EnumC2850w8.f) {
                    if (enumC2850w8 != com.inmobi.media.EnumC2850w8.g) {
                        if (enumC2850w8 != com.inmobi.media.EnumC2850w8.h) {
                            break;
                        }
                    }
                }
                interfaceC2772t9 = this.c;
                if (interfaceC2772t9 != null) {
                }
                this.q.set(enumC2850w8);
                return true;
            case 5:
                if (enumC2850w8 != com.inmobi.media.EnumC2850w8.e) {
                    if (enumC2850w8 != com.inmobi.media.EnumC2850w8.i) {
                        break;
                    }
                }
                interfaceC2772t9 = this.c;
                if (interfaceC2772t9 != null) {
                }
                this.q.set(enumC2850w8);
                return true;
            case 6:
                if (enumC2850w8 != com.inmobi.media.EnumC2850w8.e) {
                    if (enumC2850w8 != com.inmobi.media.EnumC2850w8.i) {
                        break;
                    }
                }
                interfaceC2772t9 = this.c;
                if (interfaceC2772t9 != null) {
                }
                this.q.set(enumC2850w8);
                return true;
            case 7:
                break;
            case 8:
                if (str != null) {
                    java.lang.String format = java.lang.String.format("Illegal state transition from %s to %s for %s", java.util.Arrays.copyOf(new java.lang.Object[]{enumC2850w82, enumC2850w8, str2 == null ? "state transition" : str2}, 3));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    a(str, format, str2);
                }
                com.inmobi.media.EnumC2850w8 enumC2850w83 = com.inmobi.media.EnumC2850w8.h;
                if (enumC2850w82 != enumC2850w83 && enumC2850w82 != com.inmobi.media.EnumC2850w8.i) {
                    this.q.set(enumC2850w83);
                }
                return false;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HybridVideoPlayerHandler", "Manager error (" + str + "): " + str2);
        }
        if (this.g.get()) {
            return;
        }
        com.inmobi.media.EnumC2374e8[] enumC2374e8Arr = com.inmobi.media.EnumC2374e8.f5173a;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "unknown")) {
            return;
        }
        com.inmobi.media.C2295b8 obj = new com.inmobi.media.C2295b8(str3);
        com.inmobi.media.C2622ni c2622ni = this.n;
        if (c2622ni != null) {
            com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents = com.inmobi.media.EnumC2771t8.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
            org.json.JSONObject a2 = com.inmobi.media.AbstractC2773ta.a(obj, com.inmobi.media.C2295b8.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
            c2622ni.f5358a.a(htmlVideoTemplateEvents, a2);
        }
    }

    public final void a(boolean z) {
        if (this.g.get()) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", z ? "mute" : "unmute");
        com.inmobi.media.EnumC2850w8[] enumC2850w8Arr = {com.inmobi.media.EnumC2850w8.c, com.inmobi.media.EnumC2850w8.e, com.inmobi.media.EnumC2850w8.f};
        com.inmobi.media.EnumC2374e8[] enumC2374e8Arr = com.inmobi.media.EnumC2374e8.f5173a;
        if (a(this, enumC2850w8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            com.inmobi.media.R7 r7 = this.k;
            if (r7.h.get()) {
                return;
            }
            if (z) {
                com.inmobi.media.W7 w7 = r7.y;
                w7.a();
                w7.d.a();
            } else {
                com.inmobi.media.W7 w72 = r7.y;
                com.inmobi.media.T4.a(w72.f5025a, new com.inmobi.media.V7(w72, null));
            }
        }
    }

    public final void a() {
        android.view.ViewGroup viewGroup;
        androidx.media3.datasource.cache.SimpleCache simpleCache;
        if (this.g.getAndSet(true)) {
            return;
        }
        com.inmobi.media.EnumC2850w8 enumC2850w8 = com.inmobi.media.EnumC2850w8.i;
        com.inmobi.media.EnumC2374e8[] enumC2374e8Arr = com.inmobi.media.EnumC2374e8.f5173a;
        a(enumC2850w8, "executeVideoPlayerActions", (java.lang.String) null);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("HybridVideoPlayerHandler", "destroy video player");
        }
        com.inmobi.media.R7 r7 = this.k;
        if (!r7.h.getAndSet(true)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = r7.b;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("HtmlMediaPlayer", "destroy called");
            }
            kotlinx.coroutines.Job job = r7.v;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            r7.v = null;
            r7.l.set(com.inmobi.media.Bg.h);
            r7.g.set(false);
            com.inmobi.media.T4.a(r7.k);
            r7.x.a();
            if (r7.f.get()) {
                r7.f.set(false);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r7.c, null, null, new com.inmobi.media.M7(null, r7), 3, null);
                } else {
                    r7.p.removeListener(r7.B);
                }
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r7.c, null, null, new com.inmobi.media.L7(null, r7), 3, null);
            } else {
                r7.p.stop();
                r7.p.clearMediaItems();
                r7.p.release();
                r7.z.a();
                r7.y.d.d();
            }
            com.inmobi.media.L2 l2 = r7.w;
            while (true) {
                int i = l2.f.get();
                if (i <= 0) {
                    break;
                }
                int i2 = i - 1;
                if (l2.f.compareAndSet(i, i2)) {
                    if (i2 == 0) {
                        synchronized (l2.f4810a) {
                            if (l2.f.get() == 0) {
                                simpleCache = l2.g;
                                l2.g = null;
                            } else {
                                simpleCache = null;
                            }
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        }
                    } else {
                        simpleCache = null;
                    }
                    if (simpleCache != null) {
                        simpleCache.release();
                    }
                }
            }
            r7.n.setOnPositionChangeListener(null);
            r7.n.removeAllViews();
            java.lang.ref.WeakReference weakReference = r7.r;
            if (weakReference != null && (viewGroup = (android.view.ViewGroup) weakReference.get()) != null) {
                viewGroup.removeView(r7.n);
            }
            java.lang.ref.WeakReference weakReference2 = r7.r;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(r7.c, null, 1, null);
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(r7.d, null, 1, null);
        }
        com.inmobi.media.R7 r72 = this.k;
        r72.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("totalDuration", r72.p.getDuration());
        jSONObject.put("playbackTime", r72.p.getCurrentPosition());
        jSONObject.put("bufferTime", r72.p.getBufferedPosition());
        java.lang.String durationPayload = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(durationPayload, "toString(...)");
        com.inmobi.media.C2936zi c2936zi = this.b;
        if (c2936zi != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationPayload, "durationPayload");
            java.util.Map a2 = c2936zi.a();
            a2.put("payload", durationPayload);
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("VideoDestroyed", a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
        com.inmobi.media.C2622ni c2622ni = this.n;
        if (c2622ni != null) {
            com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents = com.inmobi.media.EnumC2771t8.k;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
            c2622ni.f5358a.a(htmlVideoTemplateEvents, (java.lang.Object) null);
        }
        kotlinx.coroutines.Job job2 = this.f;
        if (job2 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.f = null;
        this.m = null;
        this.n = null;
    }

    public final void a(com.inmobi.media.AbstractC2493im obj) {
        com.inmobi.media.C2936zi c2936zi;
        com.inmobi.media.C2622ni c2622ni;
        com.inmobi.media.C2622ni c2622ni2;
        com.inmobi.media.C2464hi c2464hi;
        com.inmobi.media.C2622ni c2622ni3;
        com.inmobi.media.Gf gf;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.c;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HybridVideoPlayerHandler", "handleMediaEvent: " + obj);
        }
        boolean z = obj instanceof com.inmobi.media.Om;
        if (z) {
            com.inmobi.media.C2622ni c2622ni4 = this.n;
            if (c2622ni4 != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents = com.inmobi.media.EnumC2771t8.h;
                com.inmobi.media.EnumC2349d8[] enumC2349d8Arr = com.inmobi.media.EnumC2349d8.f5156a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
                c2622ni4.f5358a.a(htmlVideoTemplateEvents, "q1");
            }
        } else if (obj instanceof com.inmobi.media.C2941zn) {
            com.inmobi.media.C2622ni c2622ni5 = this.n;
            if (c2622ni5 != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents2 = com.inmobi.media.EnumC2771t8.h;
                com.inmobi.media.EnumC2349d8[] enumC2349d8Arr2 = com.inmobi.media.EnumC2349d8.f5156a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents2, "htmlVideoTemplateEvents");
                c2622ni5.f5358a.a(htmlVideoTemplateEvents2, "q2");
            }
        } else if (obj instanceof com.inmobi.media.In) {
            com.inmobi.media.C2622ni c2622ni6 = this.n;
            if (c2622ni6 != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents3 = com.inmobi.media.EnumC2771t8.h;
                com.inmobi.media.EnumC2349d8[] enumC2349d8Arr3 = com.inmobi.media.EnumC2349d8.f5156a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents3, "htmlVideoTemplateEvents");
                c2622ni6.f5358a.a(htmlVideoTemplateEvents3, "q3");
            }
        } else if (obj instanceof com.inmobi.media.Pm) {
            com.inmobi.media.C2622ni c2622ni7 = this.n;
            if (c2622ni7 != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents4 = com.inmobi.media.EnumC2771t8.h;
                com.inmobi.media.EnumC2349d8[] enumC2349d8Arr4 = com.inmobi.media.EnumC2349d8.f5156a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents4, "htmlVideoTemplateEvents");
                c2622ni7.f5358a.a(htmlVideoTemplateEvents4, "q4");
            }
        } else if (obj instanceof com.inmobi.media.C2442gm) {
            if (a(com.inmobi.media.EnumC2850w8.g, (java.lang.String) null, (java.lang.String) null) && (c2622ni3 = this.n) != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents5 = com.inmobi.media.EnumC2771t8.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents5, "htmlVideoTemplateEvents");
                c2622ni3.f5358a.a(htmlVideoTemplateEvents5, (java.lang.Object) null);
            }
        } else if (obj instanceof com.inmobi.media.C2531k8) {
            if (a(this, new com.inmobi.media.EnumC2850w8[]{com.inmobi.media.EnumC2850w8.b}, null, null, com.inmobi.media.EnumC2850w8.c, 6)) {
                com.inmobi.media.C2464hi c2464hi2 = this.m;
                if (c2464hi2 != null) {
                    com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState obj2 = ((com.inmobi.media.C2531k8) obj).f5290a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "videoInfo");
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = c2464hi2.f5244a.i;
                    if (interfaceC2772t92 != null) {
                        ((com.inmobi.media.C2799u9) interfaceC2772t92).b("HtmlVideoPlayer", "onVideoLoadSuccess");
                    }
                    com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = c2464hi2.f5244a;
                    com.inmobi.media.EnumC2771t8 enumC2771t8 = com.inmobi.media.EnumC2771t8.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "obj");
                    gestureDetectorOnGestureListenerC2675pi.a(enumC2771t8, com.inmobi.media.AbstractC2773ta.a(obj2, com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState.class));
                }
                if (this.o) {
                    this.k.e();
                }
            }
        } else if (obj instanceof com.inmobi.media.C2401f8) {
            if (a(this, new com.inmobi.media.EnumC2850w8[]{com.inmobi.media.EnumC2850w8.b}, null, null, com.inmobi.media.EnumC2850w8.d, 6) && (c2464hi = this.m) != null) {
                c2464hi.a((com.inmobi.media.C2401f8) obj);
            }
        } else if (obj instanceof com.inmobi.media.C2584m8) {
            a(com.inmobi.media.EnumC2850w8.h, (java.lang.String) null, (java.lang.String) null);
            com.inmobi.media.C2622ni c2622ni8 = this.n;
            if (c2622ni8 != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents6 = com.inmobi.media.EnumC2771t8.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
                org.json.JSONObject a2 = com.inmobi.media.AbstractC2773ta.a(obj, obj.getClass());
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents6, "htmlVideoTemplateEvents");
                c2622ni8.f5358a.a(htmlVideoTemplateEvents6, a2);
            }
        } else if (obj instanceof com.inmobi.media.C2417fn) {
            com.inmobi.media.EnumC2850w8[] enumC2850w8Arr = {com.inmobi.media.EnumC2850w8.e};
            com.inmobi.media.EnumC2850w8 enumC2850w8 = com.inmobi.media.EnumC2850w8.f;
            a(this, enumC2850w8Arr, null, null, enumC2850w8, 6);
            if (this.q.get() == enumC2850w8 && (c2622ni2 = this.n) != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents7 = com.inmobi.media.EnumC2771t8.f;
                com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState obj3 = this.k.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj3, "obj");
                org.json.JSONObject a3 = com.inmobi.media.AbstractC2773ta.a(obj3, com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState.class);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents7, "htmlVideoTemplateEvents");
                c2622ni2.f5358a.a(htmlVideoTemplateEvents7, a3);
            }
        } else if (obj instanceof com.inmobi.media.C2916yn) {
            com.inmobi.media.EnumC2850w8[] enumC2850w8Arr2 = {com.inmobi.media.EnumC2850w8.c, com.inmobi.media.EnumC2850w8.f, com.inmobi.media.EnumC2850w8.g};
            com.inmobi.media.EnumC2850w8 enumC2850w82 = com.inmobi.media.EnumC2850w8.e;
            a(this, enumC2850w8Arr2, null, null, enumC2850w82, 6);
            if (this.q.get() == enumC2850w82 && (c2622ni = this.n) != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents8 = com.inmobi.media.EnumC2771t8.f;
                com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState obj4 = this.k.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj4, "obj");
                org.json.JSONObject a4 = com.inmobi.media.AbstractC2773ta.a(obj4, com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState.class);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents8, "htmlVideoTemplateEvents");
                c2622ni.f5358a.a(htmlVideoTemplateEvents8, a4);
            }
        } else if (obj instanceof com.inmobi.media.Bn) {
            com.inmobi.media.C2622ni c2622ni9 = this.n;
            if (c2622ni9 != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents9 = com.inmobi.media.EnumC2771t8.h;
                com.inmobi.media.EnumC2349d8[] enumC2349d8Arr5 = com.inmobi.media.EnumC2349d8.f5156a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents9, "htmlVideoTemplateEvents");
                c2622ni9.f5358a.a(htmlVideoTemplateEvents9, "q0");
            }
        } else if (obj instanceof com.inmobi.media.C2664p8) {
            com.inmobi.media.C2664p8 c2664p8 = (com.inmobi.media.C2664p8) obj;
            float f = c2664p8.f5386a / 1000.0f;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("time", java.lang.Float.valueOf(f));
            jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Float.valueOf(c2664p8.b / 1000.0f));
            com.inmobi.media.C2622ni c2622ni10 = this.n;
            if (c2622ni10 != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents10 = com.inmobi.media.EnumC2771t8.g;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents10, "htmlVideoTemplateEvents");
                c2622ni10.f5358a.a(htmlVideoTemplateEvents10, jSONObject);
            }
        } else if (obj instanceof com.inmobi.media.C2638o8) {
            com.inmobi.media.C2622ni c2622ni11 = this.n;
            if (c2622ni11 != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents11 = com.inmobi.media.EnumC2771t8.m;
                com.inmobi.media.videoPlayer.model.VideoViewPosition obj5 = ((com.inmobi.media.C2638o8) obj).f5370a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj5, "obj");
                org.json.JSONObject a5 = com.inmobi.media.AbstractC2773ta.a(obj5, com.inmobi.media.videoPlayer.model.VideoViewPosition.class);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents11, "htmlVideoTemplateEvents");
                c2622ni11.f5358a.a(htmlVideoTemplateEvents11, a5);
            }
        } else if (obj instanceof com.inmobi.media.C2269a8) {
            com.inmobi.media.C2622ni c2622ni12 = this.n;
            if (c2622ni12 != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents12 = com.inmobi.media.EnumC2771t8.n;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents12, "htmlVideoTemplateEvents");
                c2622ni12.f5358a.a(htmlVideoTemplateEvents12, (java.lang.Object) null);
            }
        } else if (obj instanceof com.inmobi.media.C2558l8) {
            com.inmobi.media.C2622ni c2622ni13 = this.n;
            if (c2622ni13 != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents13 = com.inmobi.media.EnumC2771t8.o;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents13, "htmlVideoTemplateEvents");
                c2622ni13.f5358a.a(htmlVideoTemplateEvents13, (java.lang.Object) null);
            }
        } else if (obj instanceof com.inmobi.media.S1) {
            com.inmobi.media.C2622ni c2622ni14 = this.n;
            if (c2622ni14 != null) {
                com.inmobi.media.EnumC2771t8 htmlVideoTemplateEvents14 = com.inmobi.media.EnumC2771t8.f;
                com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState obj6 = this.k.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj6, "obj");
                org.json.JSONObject a6 = com.inmobi.media.AbstractC2773ta.a(obj6, com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState.class);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents14, "htmlVideoTemplateEvents");
                c2622ni14.f5358a.a(htmlVideoTemplateEvents14, a6);
            }
        } else if ((obj instanceof com.inmobi.media.C2798u8) && (c2936zi = this.b) != null) {
            java.util.Map a7 = c2936zi.a();
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("ViewStateOnParentAttached", a7, com.inmobi.media.EnumC2728rk.f5431a);
        }
        if ((z || (obj instanceof com.inmobi.media.C2941zn) || (obj instanceof com.inmobi.media.In) || (obj instanceof com.inmobi.media.C2442gm) || (obj instanceof com.inmobi.media.Bn) || (obj instanceof com.inmobi.media.C2417fn) || (obj instanceof com.inmobi.media.C2916yn) || (obj instanceof com.inmobi.media.C2584m8) || (obj instanceof com.inmobi.media.S1)) && (gf = this.p) != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "videoEvent");
            com.inmobi.media.Ie ie = gf.e;
            if (ie != null) {
                ie.a(obj);
            }
        }
    }
}
