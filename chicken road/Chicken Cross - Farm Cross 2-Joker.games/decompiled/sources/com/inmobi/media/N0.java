package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f6730a;
    public final Y9 b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final CopyOnWriteArrayList f;
    public AdQualityControl g;
    public Vp h;
    public AdQualityResult i;
    public String j;
    public JSONObject k;
    public final AtomicBoolean l;

    public N0(AdConfig.AdQualityConfig adQualityConfig, Y9 y9) {
        Intrinsics.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.f6730a = adQualityConfig;
        this.b = y9;
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new CopyOnWriteArrayList();
        this.h = Vp.f6918a;
        this.j = "";
        this.k = new JSONObject();
        this.l = new AtomicBoolean(false);
    }

    public final void a(String str, byte[] bArr, boolean z) {
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            C4028ql c4028ql = new C4028ql(context.getFilesDir().getAbsolutePath() + "/adQuality/screenshots", bArr);
            if (!z) {
                this.f.add(c4028ql);
            }
            AbstractC3665e.a(c4028ql, new L0(this, z, c4028ql, str), null, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0030: INVOKE 
                  (r1v2 'c4028ql' com.inmobi.media.ql)
                  (wrap:com.inmobi.media.L0:0x002d: CONSTRUCTOR 
                  (r2v0 'this' com.inmobi.media.N0 A[IMMUTABLE_TYPE, THIS])
                  (r5v0 'z' boolean)
                  (r1v2 'c4028ql' com.inmobi.media.ql)
                  (r3v0 'str' java.lang.String)
                 A[MD:(com.inmobi.media.N0, boolean, com.inmobi.media.ql, java.lang.String):void (m), WRAPPED] (LINE:9) call: com.inmobi.media.L0.<init>(com.inmobi.media.N0, boolean, com.inmobi.media.ql, java.lang.String):void type: CONSTRUCTOR)
                  (null java.lang.Long)
                  (wrap:kotlin.jvm.functions.Function0:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1) call: com.inmobi.media.e$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR)
                 STATIC call: com.inmobi.media.e.a(com.inmobi.media.O0, com.inmobi.media.Wh, java.lang.Long, kotlin.jvm.functions.Function0):void A[MD:(com.inmobi.media.O0, com.inmobi.media.Wh, java.lang.Long, kotlin.jvm.functions.Function0):void (m)] (LINE:2) in method: com.inmobi.media.N0.a(java.lang.String, byte[], boolean):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.inmobi.media.e$$ExternalSyntheticLambda1, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 23 more
                */
            /*
                this = this;
                android.content.Context r0 = com.inmobi.media.AbstractC3914mk.f7252a
                if (r0 == 0) goto L33
                java.io.File r0 = r0.getFilesDir()
                java.lang.String r0 = r0.getAbsolutePath()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r1 = "/adQuality/screenshots"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.inmobi.media.ql r1 = new com.inmobi.media.ql
                r1.<init>(r0, r4)
                if (r5 != 0) goto L2b
                java.util.concurrent.CopyOnWriteArrayList r4 = r2.f
                r4.add(r1)
            L2b:
                com.inmobi.media.L0 r4 = new com.inmobi.media.L0
                r4.<init>(r2, r5, r1, r3)
                com.inmobi.media.AbstractC3665e.a(r1, r4)
            L33:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.N0.a(java.lang.String, byte[], boolean):void");
        }

        public final void a(Activity activity, String url, boolean z, JSONObject extras, C3970oj listener) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (extras.length() > 0 && url.length() > 0) {
                this.j = url;
                this.k = extras;
                a("report ad starting");
                if (z) {
                    a("report ad capture");
                    a(activity, 0L, true, listener);
                    return;
                } else {
                    a("report ad report");
                    a(new AdQualityResult("", null, url, extras.toString()), false);
                    return;
                }
            }
            listener.f7290a.h("window.mraidview.broadcastEvent('AdReportFailed')");
            a("Incorrect parameters for reporting. url - " + url + " , extras - " + extras, (Exception) null);
        }

        public final void a(Ej view, String url, boolean z, JSONObject extras, C3970oj listener) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (extras.length() > 0 && url.length() > 0) {
                this.j = url;
                this.k = extras;
                if (z) {
                    a(view, 0L, true, listener);
                    return;
                } else {
                    a(new AdQualityResult("", null, url, extras.toString()), false);
                    return;
                }
            }
            listener.f7290a.h("window.mraidview.broadcastEvent('AdReportFailed')");
            a("Incorrect parameters for reporting. url - " + url + " , extras - " + extras, (Exception) null);
        }

        public final boolean a() {
            if (this.c.get()) {
                a("ad quality session is already in progress. skipping...");
                return false;
            }
            if (!this.f6730a.getEnabled()) {
                a("config kill switch while state check - false. ad quality will skip");
                return false;
            }
            if (this.g == null) {
                a("setup not done. skipping");
                return false;
            }
            Vp vp = this.h;
            if (vp != Vp.f6918a && vp != Vp.b) {
                return true;
            }
            a("ad view is not visible. skipping");
            return false;
        }

        public final void a(AdQualityResult adQualityResult, boolean z) {
            if (adQualityResult.getBeaconUrl().length() != 0) {
                AbstractC3665e.a(new Hi(adQualityResult), new K0(this, z), null, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: INVOKE 
                      (wrap:com.inmobi.media.Hi:0x0012: CONSTRUCTOR (r2v0 'adQualityResult' com.inmobi.adquality.models.AdQualityResult) A[MD:(com.inmobi.adquality.models.AdQualityResult):void (m), WRAPPED] (LINE:57) call: com.inmobi.media.Hi.<init>(com.inmobi.adquality.models.AdQualityResult):void type: CONSTRUCTOR)
                      (wrap:com.inmobi.media.K0:0x0017: CONSTRUCTOR (r1v0 'this' com.inmobi.media.N0 A[IMMUTABLE_TYPE, THIS]), (r3v0 'z' boolean) A[MD:(com.inmobi.media.N0, boolean):void (m), WRAPPED] (LINE:58) call: com.inmobi.media.K0.<init>(com.inmobi.media.N0, boolean):void type: CONSTRUCTOR)
                      (null java.lang.Long)
                      (wrap:kotlin.jvm.functions.Function0:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1) call: com.inmobi.media.e$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR)
                     STATIC call: com.inmobi.media.e.a(com.inmobi.media.O0, com.inmobi.media.Wh, java.lang.Long, kotlin.jvm.functions.Function0):void A[MD:(com.inmobi.media.O0, com.inmobi.media.Wh, java.lang.Long, kotlin.jvm.functions.Function0):void (m)] (LINE:2) in method: com.inmobi.media.N0.a(com.inmobi.adquality.models.AdQualityResult, boolean):void, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.inmobi.media.e$$ExternalSyntheticLambda1, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 21 more
                    */
                /*
                    this = this;
                    java.lang.String r0 = r2.getBeaconUrl()
                    int r0 = r0.length()
                    if (r0 != 0) goto L10
                    java.lang.String r2 = "beacon is empty"
                    r1.a(r2)
                    return
                L10:
                    com.inmobi.media.Hi r0 = new com.inmobi.media.Hi
                    r0.<init>(r2)
                    com.inmobi.media.K0 r2 = new com.inmobi.media.K0
                    r2.<init>(r1, r3)
                    com.inmobi.media.AbstractC3665e.a(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.N0.a(com.inmobi.adquality.models.AdQualityResult, boolean):void");
            }

            public final void a(final Ej ej, final long j, final boolean z, final C3970oj c3970oj) {
                a("isCapture started - " + this.l.get() + ", isReporting - " + z);
                if (this.l.get() && !z) {
                    a("Screenshot process already in progress... skipping...", (Exception) null);
                } else {
                    ej.post(new Runnable() { // from class: com.inmobi.media.N0$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            N0.a(N0.this, ej, j, z, c3970oj);
                        }
                    });
                }
            }

            public static final void a(N0 n0, View adView, long j, boolean z, C3970oj c3970oj) {
                n0.getClass();
                Intrinsics.checkNotNullParameter(adView, "adView");
                n0.a(new C3856kk(adView, n0.f6730a), j, z, c3970oj);
                n0.l.set(!z);
            }

            public final void a(final Activity activity, final long j, final boolean z, final C3970oj c3970oj) {
                a("isCapture started - " + this.l.get() + ", isReporting - " + z);
                if (this.l.get() && !z) {
                    a("Screenshot process already in progress... skipping...", (Exception) null);
                } else {
                    activity.getWindow().getDecorView().post(new Runnable() { // from class: com.inmobi.media.N0$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            N0.a(N0.this, activity, j, z, c3970oj);
                        }
                    });
                }
            }

            public static final void a(N0 n0, Activity activity, long j, boolean z, C3970oj c3970oj) {
                n0.a("activity is visible");
                Window window = activity.getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                Intrinsics.checkNotNullParameter(window, "window");
                n0.a(new Ih(window, n0.f6730a), j, z, c3970oj);
                n0.l.set(!z);
            }

            public final void a(Q2 q2, long j, boolean z, C3970oj c3970oj) {
                if (!z) {
                    this.f.add(q2);
                }
                AbstractC3665e.a(q2, new M0(this, q2, z, c3970oj), Long.valueOf(j), new Function0() { // from class: com.inmobi.media.N0$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(N0.a(N0.this));
                    }
                });
            }

            public static final boolean a(N0 n0) {
                return n0.h == Vp.c;
            }

            public final void a(Bitmap bitmap, O0 process, boolean z, C3970oj c3970oj) {
                String beacon;
                Intrinsics.checkNotNullParameter(process, "process");
                a("Screen shot result received - isReporting - " + z);
                this.f.remove(process);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmap != null) {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (bitmap != null && c3970oj != null) {
                    c3970oj.f7290a.h("window.mraidview.broadcastEvent('ScreenshotSuccess')");
                }
                if (!z) {
                    AdQualityControl adQualityControl = this.g;
                    if (adQualityControl != null && (beacon = adQualityControl.getBeacon()) != null) {
                        a("saving to file - beacon - " + beacon);
                        Intrinsics.checkNotNull(byteArray);
                        a(beacon, byteArray, false);
                    }
                } else {
                    String str = this.j;
                    Intrinsics.checkNotNull(byteArray);
                    a(str, byteArray, true);
                }
                this.l.set(false);
            }

            public final void a(Exception exc, O0 process) {
                Intrinsics.checkNotNullParameter(process, "process");
                a("error in running process - " + process.getClass().getSimpleName(), exc);
                this.f.remove(process);
                a(true);
            }

            public final void a(String result, O0 process, String beacon, boolean z) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(process, "process");
                Intrinsics.checkNotNullParameter(beacon, "beacon");
                if (z) {
                    a(new AdQualityResult(result, null, beacon, this.k.toString()), false);
                    return;
                }
                this.f.remove(process);
                AdQualityResult adQualityResult = this.i;
                if (adQualityResult != null) {
                    adQualityResult.setImageLocation(result);
                } else {
                    this.i = new AdQualityResult(result, null, beacon, null, 8, null);
                }
                a("file is saved. result - " + this.i);
                a(true);
            }

            public final void a(boolean z) {
                String beacon;
                AdQualityControl adQualityControl = this.g;
                if (adQualityControl == null || (beacon = adQualityControl.getBeacon()) == null) {
                    return;
                }
                if (this.f.isEmpty() && this.d.get() && !this.e.get()) {
                    this.e.set(true);
                    a("session end - queuing result");
                    AdQualityResult adQualityResult = this.i;
                    if (adQualityResult == null) {
                        adQualityResult = new AdQualityResult("null", null, beacon, null, 8, null);
                    }
                    a(adQualityResult, true);
                    return;
                }
                if (this.d.get() && !z && !this.e.get()) {
                    this.e.set(true);
                    a("session stop - queuing result");
                    CoroutineScope coroutineScope = G0.e;
                    if (coroutineScope != null) {
                        CoroutineScopeKt.cancel(coroutineScope, new CancellationException("Shutdown"));
                    }
                    G0.e = null;
                    AdQualityResult adQualityResult2 = this.i;
                    if (adQualityResult2 == null) {
                        adQualityResult2 = new AdQualityResult("null", null, beacon, null, 8, null);
                    }
                    a(adQualityResult2, true);
                    return;
                }
                String str = "list size - " + this.f.size() + " session end triggered - " + this.d.get() + " queue triggered - " + this.e + " waiting";
            }

            public final void a(String str) {
                Y9 y9 = this.b;
                if (y9 != null) {
                    ((Z9) y9).a("AdQualityManager", str);
                }
            }

            public final void a(String str, Exception exc) {
                Unit unit;
                if (exc != null) {
                    Y9 y9 = this.b;
                    if (y9 != null) {
                        ((Z9) y9).a("AdQualityManager", str, exc);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        return;
                    }
                }
                Y9 y92 = this.b;
                if (y92 != null) {
                    ((Z9) y92).b("AdQualityManager", "Error with null exception : " + str);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
