package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

/* loaded from: classes5.dex */
public final class k {
    public static final java.lang.String A = "CustomClick";
    public static final java.lang.String B = "Icons";
    public static final java.lang.String C = "Icon";
    public static final java.lang.String D = "StaticResource";
    public static final java.lang.String E = "IFrameResource";
    public static final java.lang.String F = "HTMLResource";
    public static final java.lang.String G = "IconClicks";
    public static final java.lang.String H = "IconClickThrough";
    public static final java.lang.String I = "IconClickTracking";
    public static final java.lang.String J = "IconViewTracking";
    public static final java.lang.String K = "AltText";
    public static final java.lang.String L = "CompanionAds";
    public static final java.lang.String M = "Companion";
    public static final java.lang.String N = "CompanionClickThrough";
    public static final java.lang.String O = "CompanionClickTracking";

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f7710a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.a();
        }
    });
    public static final java.text.NumberFormat b = java.text.NumberFormat.getPercentInstance();
    public static final java.lang.String c = "Error";
    public static final java.lang.String d = "Ad";
    public static final java.lang.String e = "InLine";
    public static final java.lang.String f = "Wrapper";
    public static final java.lang.String g = "VASTAdTagURI";
    public static final java.lang.String h = "AdSystem";
    public static final java.lang.String i = "AdTitle";
    public static final java.lang.String j = "Description";
    public static final java.lang.String k = "Advertiser";
    public static final java.lang.String l = "Pricing";
    public static final java.lang.String m = "Survey";
    public static final java.lang.String n = "Impression";
    public static final java.lang.String o = "Creatives";
    public static final java.lang.String p = "Creative";
    public static final java.lang.String q = "Linear";
    public static final java.lang.String r = "AdParameters";
    public static final java.lang.String s = "Duration";
    public static final java.lang.String t = "MediaFiles";
    public static final java.lang.String u = "MediaFile";
    public static final java.lang.String v = "TrackingEvents";
    public static final java.lang.String w = "Tracking";
    public static final java.lang.String x = "VideoClicks";
    public static final java.lang.String y = "ClickThrough";
    public static final java.lang.String z = "ClickTracking";

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {941}, m = "parseInLineTag", n = {"adSystem", "adTitle", "description", com.ironsource.X3.i.F0, "pricing", "impressions", "errorUrls", "creatives"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
    public static final class A extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7711a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public java.lang.Object f;
        public java.lang.Object g;
        public java.lang.Object h;
        public /* synthetic */ java.lang.Object i;
        public int j;

        public A(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.A> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.i = obj;
            this.j |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseLinearTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1, 2, 3, 4, 5}, l = {124, 125, 126, 127, 128, 129}, m = "invokeSuspend", n = {"initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth"}, s = {"I$0", "I$0", "I$0", "I$0", "I$0", "I$0"})
    public static final class B extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7712a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef g;
        public final /* synthetic */ java.util.List h;
        public final /* synthetic */ java.util.List i;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ java.util.List l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2, kotlin.jvm.internal.Ref.ObjectRef objectRef3, java.util.List list, java.util.List list2, kotlin.jvm.internal.Ref.ObjectRef objectRef4, boolean z, java.util.List list3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = list;
            this.i = list2;
            this.j = objectRef4;
            this.k = z;
            this.l = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            b.c = obj;
            return b;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01c8  */
        /* JADX WARN: Type inference failed for: r6v19, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r6v40, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r] */
        /* JADX WARN: Type inference failed for: r6v44, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v46, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0096 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a0 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a8 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ae -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b9 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00da -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00eb -> B:7:0x00ee). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00fb -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x011c -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x013a -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0161 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0181 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01a3 -> B:8:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01bc -> B:8:0x01c1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            kotlin.jvm.internal.Ref.ObjectRef objectRef;
            java.lang.Object obj2;
            java.lang.String str;
            java.lang.String text;
            org.xmlpull.v1.XmlPullParser xmlPullParser;
            java.lang.String name;
            java.util.List list;
            java.lang.Object obj3;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.b) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                    if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                        this.d.nextTag();
                    }
                    if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                    }
                    depth = this.d.getDepth();
                    if (this.d.getDepth() < depth) {
                        return kotlin.Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 != 0) {
                        if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                            switch (name.hashCode()) {
                                case -2049897434:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x)) {
                                        kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.j;
                                        boolean z = this.k;
                                        this.c = objectRef2;
                                        this.f7712a = depth;
                                        this.b = 5;
                                        ?? h = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(xmlPullParser, z, this);
                                        if (h != coroutine_suspended) {
                                            objectRef2.element = h;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case -1927368268:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.s)) {
                                        objectRef = this.g;
                                        this.c = objectRef;
                                        this.f7712a = depth;
                                        this.b = 2;
                                        java.lang.Object P = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(xmlPullParser, this);
                                        obj2 = P;
                                        if (P == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        str = (java.lang.String) obj2;
                                        if (str != null) {
                                            objectRef.element = null;
                                            break;
                                        } else {
                                            objectRef.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f(str);
                                            break;
                                        }
                                    }
                                    break;
                                case -1348833651:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.r)) {
                                        kotlin.jvm.internal.Ref.ObjectRef objectRef3 = this.f;
                                        this.c = objectRef3;
                                        this.f7712a = depth;
                                        this.b = 1;
                                        ?? y = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.y(xmlPullParser, this);
                                        if (y != coroutine_suspended) {
                                            objectRef3.element = y;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case -385055469:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t)) {
                                        java.util.List list2 = this.h;
                                        this.c = list2;
                                        this.f7712a = depth;
                                        this.b = 3;
                                        java.lang.Object M = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M(xmlPullParser, this);
                                        if (M != coroutine_suspended) {
                                            list2.addAll((java.util.Collection) M);
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 70476538:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B)) {
                                        list = this.l;
                                        this.c = list;
                                        this.f7712a = depth;
                                        this.b = 6;
                                        java.lang.Object I = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I(xmlPullParser, this);
                                        obj3 = I;
                                        if (I == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        list.addAll((java.util.Collection) obj3);
                                        break;
                                    }
                                    break;
                                case 611554000:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v)) {
                                        java.util.List list3 = this.i;
                                        this.c = list3;
                                        this.f7712a = depth;
                                        this.b = 4;
                                        java.lang.Object Q = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Q(xmlPullParser, this);
                                        if (Q != coroutine_suspended) {
                                            list3.addAll((java.util.Collection) Q);
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                            }
                        }
                    } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        this.e.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n(this.d);
                    } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                        java.lang.String text2 = this.d.getText();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                    } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 1:
                    depth = this.f7712a;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef4.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 2:
                    depth = this.f7712a;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    str = (java.lang.String) obj2;
                    if (str != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 3:
                    depth = this.f7712a;
                    java.util.List list4 = (java.util.List) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    list4.addAll((java.util.Collection) obj);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 4:
                    depth = this.f7712a;
                    java.util.List list5 = (java.util.List) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    list5.addAll((java.util.Collection) obj);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 5:
                    depth = this.f7712a;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef5.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 6:
                    depth = this.f7712a;
                    list = (java.util.List) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    list.addAll((java.util.Collection) obj3);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {941}, m = "parseLinearTag", n = {"skipOffset", "adParameters", "durationMillis", "mediaFiles", "trackingList", "videoClicks", "icons", "isInLineParent"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0"})
    public static final class C extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7713a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public java.lang.Object f;
        public java.lang.Object g;
        public java.lang.Object h;
        public /* synthetic */ java.lang.Object i;
        public int j;

        public C(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.i = obj;
            this.j |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseMediaFileTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class D extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7714a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef g;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef h;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef i;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef j;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef k;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef l;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef m;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef n;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef o;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2, kotlin.jvm.internal.Ref.ObjectRef objectRef3, kotlin.jvm.internal.Ref.ObjectRef objectRef4, kotlin.jvm.internal.Ref.ObjectRef objectRef5, kotlin.jvm.internal.Ref.ObjectRef objectRef6, kotlin.jvm.internal.Ref.ObjectRef objectRef7, kotlin.jvm.internal.Ref.ObjectRef objectRef8, kotlin.jvm.internal.Ref.ObjectRef objectRef9, kotlin.jvm.internal.Ref.ObjectRef objectRef10, kotlin.jvm.internal.Ref.ObjectRef objectRef11, kotlin.jvm.internal.Ref.ObjectRef objectRef12) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = objectRef4;
            this.i = objectRef5;
            this.j = objectRef6;
            this.k = objectRef7;
            this.l = objectRef8;
            this.m = objectRef9;
            this.n = objectRef10;
            this.o = objectRef11;
            this.p = objectRef12;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
            d.c = obj;
            return d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v17, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String text;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                this.d.nextTag();
            }
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                return kotlin.Unit.INSTANCE;
            }
            if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d);
                    }
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    this.e.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "id");
                    this.f.element = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(kotlin.jvm.internal.Intrinsics.areEqual(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, com.ironsource.C3300u.g), "progressive"));
                    this.g.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "type");
                    kotlin.jvm.internal.Ref.ObjectRef objectRef = this.h;
                    java.lang.String b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "width");
                    objectRef.element = b != null ? kotlin.text.StringsKt.toIntOrNull(b) : 0;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.i;
                    java.lang.String b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "height");
                    objectRef2.element = b2 != null ? kotlin.text.StringsKt.toIntOrNull(b2) : 0;
                    this.j.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "codec");
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = this.k;
                    java.lang.String b3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "bitrate");
                    objectRef3.element = b3 != null ? kotlin.text.StringsKt.toIntOrNull(b3) : 0;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = this.l;
                    java.lang.String b4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "minBitrate");
                    objectRef4.element = b4 != null ? kotlin.text.StringsKt.toIntOrNull(b4) : 0;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef5 = this.m;
                    java.lang.String b5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "maxBitrate");
                    objectRef5.element = b5 != null ? kotlin.text.StringsKt.toIntOrNull(b5) : 0;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef6 = this.n;
                    java.lang.String b6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "scalable");
                    objectRef6.element = b6 != null ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(java.lang.Boolean.parseBoolean(b6)) : 0;
                    this.o.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "apiFramework");
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                    java.lang.String text2 = this.d.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.p.element = kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                this.d.next();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {941}, m = "parseMediaFileTag", n = {"mediaFileUrl", "id", "isProgressiveDelivery", "type", "widthPx", "heightPx", "codec", "bitrate", "minBitrate", "maxBitrate", "isScalable", "apiFramework"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11"})
    public static final class E extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7715a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public java.lang.Object f;
        public java.lang.Object g;
        public java.lang.Object h;
        public java.lang.Object i;
        public java.lang.Object j;
        public java.lang.Object k;
        public java.lang.Object l;
        public /* synthetic */ java.lang.Object m;
        public int n;

        public E(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.m = obj;
            this.n |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseMediaFilesTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0}, l = {123}, m = "invokeSuspend", n = {"initialDepth"}, s = {"I$0"})
    public static final class F extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7716a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ java.util.List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, java.util.List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F(this.d, continuation, this.e);
            f.c = obj;
            return f;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.lang.String text;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.f7716a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj;
                if (qVar != null) {
                    this.e.add(qVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return kotlin.Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                            java.lang.String text2 = this.d.getText();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.u)) {
                        this.f7716a = depth;
                        this.b = 1;
                        obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L(xmlPullParser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj;
                        if (qVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0}, l = {941}, m = "parseMediaFilesTag", n = {"mediaFiles"}, s = {"L$0"})
    public static final class G extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7717a;
        public /* synthetic */ java.lang.Object b;
        public int c;

        public G(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parsePricingTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class H extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7718a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H h = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H(this.d, continuation, this.e, this.f);
            h.c = obj;
            return h;
        }

        /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String text;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                this.d.nextTag();
            }
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                return kotlin.Unit.INSTANCE;
            }
            if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d);
                    }
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    this.e.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "model");
                    this.f.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "currency");
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                    java.lang.String text2 = this.d.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                this.d.next();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parsePricingTag", n = {"model", "currency"}, s = {"L$0", "L$1"})
    public static final class I extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7719a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int d;

        public I(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseStaticResourceTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class J extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7720a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J j = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J(this.d, continuation, this.e, this.f);
            j.c = obj;
            return j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String text;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                this.d.nextTag();
            }
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                return kotlin.Unit.INSTANCE;
            }
            if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d);
                    }
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef = this.e;
                    java.lang.String b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "creativeType");
                    objectRef.element = b != null ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e(b) : 0;
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                    java.lang.String text2 = this.d.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                this.d.next();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parseStaticResourceTag", n = {"resource", "creativeType"}, s = {"L$0", "L$1"})
    public static final class K extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7721a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int d;

        public K(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseTagsTextOnly$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class L extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7722a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L l = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L(this.d, continuation, this.e);
            l.c = obj;
            return l;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String text;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                this.d.nextTag();
            }
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                return kotlin.Unit.INSTANCE;
            }
            if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d);
                    }
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    continue;
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                    java.lang.String text2 = this.d.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.e.element = kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                this.d.next();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0}, l = {941}, m = "parseTagsTextOnly", n = {"simpleText"}, s = {"L$0"})
    public static final class M extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7723a;
        public /* synthetic */ java.lang.Object b;
        public int c;

        public M(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseTrackingEventsTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0}, l = {123}, m = "invokeSuspend", n = {"initialDepth"}, s = {"I$0"})
    public static final class N extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7724a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ java.util.List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public N(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, java.util.List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N n = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N(this.d, continuation, this.e);
            n.c = obj;
            return n;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.lang.String text;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.f7724a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u uVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u) obj;
                if (uVar != null) {
                    this.e.add(uVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return kotlin.Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                            java.lang.String text2 = this.d.getText();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w)) {
                        this.f7724a = depth;
                        this.b = 1;
                        obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.R(xmlPullParser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u uVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u) obj;
                        if (uVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0}, l = {941}, m = "parseTrackingEventsTag", n = {"trackingList"}, s = {"L$0"})
    public static final class O extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7725a;
        public /* synthetic */ java.lang.Object b;
        public int c;

        public O(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Q(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseTrackingTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class P extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7726a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2, kotlin.jvm.internal.Ref.ObjectRef objectRef3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P p = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(this.d, continuation, this.e, this.f, this.g);
            p.c = obj;
            return p;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String text;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                this.d.nextTag();
            }
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                return kotlin.Unit.INSTANCE;
            }
            if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d);
                    }
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef = this.e;
                    java.lang.String b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                    objectRef.element = b != null ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(b) : 0;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.f;
                    java.lang.String b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "offset");
                    objectRef2.element = b2 != null ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g(b2) : 0;
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                    java.lang.String text2 = this.d.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.g.element = kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                this.d.next();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0}, l = {941}, m = "parseTrackingTag", n = {androidx.core.app.NotificationCompat.CATEGORY_EVENT, "url", "offset"}, s = {"L$0", "L$1", "L$2"})
    public static final class Q extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7727a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int e;

        public Q(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.R(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVast$2", f = "VastParser.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class R extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7728a;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public R(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.R> continuation) {
            super(2, continuation);
            this.b = xmlPullParser;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.R) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.R(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7728a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                org.xmlpull.v1.XmlPullParser xmlPullParser = this.b;
                this.f7728a = 1;
                obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.T(xmlPullParser, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVastTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1}, l = {124, 125}, m = "invokeSuspend", n = {"initialDepth", "initialDepth"}, s = {"I$0", "I$0"})
    public static final class S extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7729a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;
        public final /* synthetic */ java.util.List g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public S(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2, java.util.List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.S) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.S s = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.S(this.d, continuation, this.e, this.f, this.g);
            s.c = obj;
            return s;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00af  */
        /* JADX WARN: Type inference failed for: r7v34, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v39, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0069 -> B:9:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:9:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009b -> B:9:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a8 -> B:6:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bd -> B:9:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e1 -> B:9:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fa -> B:9:0x00ff). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.lang.String text;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.f7729a;
                kotlin.jvm.internal.Ref.ObjectRef objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                objectRef.element = obj;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.f7729a;
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Object obj2 = obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C3490a c3490a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C3490a) obj2;
                if (c3490a != null) {
                    this.g.add(c3490a);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return kotlin.Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        this.e.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(this.d, "version");
                    } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                        java.lang.String text2 = this.d.getText();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                    } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                        return kotlin.Unit.INSTANCE;
                    }
                } else if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    java.lang.String name = xmlPullParser.getName();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c)) {
                        kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.f;
                        this.c = objectRef2;
                        this.f7729a = depth;
                        this.b = 1;
                        ?? D = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D(xmlPullParser, this);
                        if (D == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef2.element = D;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.d)) {
                        this.c = null;
                        this.f7729a = depth;
                        this.b = 2;
                        java.lang.Object A = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.A(xmlPullParser, this);
                        obj2 = A;
                        if (A == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C3490a c3490a2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C3490a) obj2;
                        if (c3490a2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0}, l = {941}, m = "parseVastTag", n = {"ads", "version", "errorUrl"}, s = {"L$0", "L$1", "L$2"})
    public static final class T extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7730a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int e;

        public T(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.T> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.T(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVideoClickTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class U extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7731a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public U(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.U) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.U u = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.U(this.d, continuation, this.e, this.f);
            u.c = obj;
            return u;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String text;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                this.d.nextTag();
            }
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                return kotlin.Unit.INSTANCE;
            }
            if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d);
                    }
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    this.e.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(this.d, "id");
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                    java.lang.String text2 = this.d.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                this.d.next();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parseVideoClickTag", n = {"id", "url"}, s = {"L$0", "L$1"})
    public static final class V extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7732a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int d;

        public V(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.V> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.U(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVideoClicksTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1, 2}, l = {123, 124, 126}, m = "invokeSuspend", n = {"initialDepth", "initialDepth", "initialDepth"}, s = {"I$0", "I$0", "I$0"})
    public static final class W extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7733a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ java.util.List f;
        public final /* synthetic */ java.util.List g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public W(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, java.util.List list, java.util.List list2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = list;
            this.g = list2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.W) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.W w = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.W(this.d, continuation, this.e, this.f, this.g);
            w.c = obj;
            return w;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00db  */
        /* JADX WARN: Type inference failed for: r10v38, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0074 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0086 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009a -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a4 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b7 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b9 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c6 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d4 -> B:7:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e7 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0102 -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x011c -> B:10:0x013a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0135 -> B:10:0x013a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.lang.Object obj2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar;
            java.lang.String text;
            org.xmlpull.v1.XmlPullParser xmlPullParser;
            java.lang.String name;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.f7733a;
                kotlin.jvm.internal.Ref.ObjectRef objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                objectRef.element = obj;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 2) {
                depth = this.f7733a;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj;
                zVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z) obj2;
                if (zVar != null) {
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.f7733a;
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Object obj3 = obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z) obj3;
                if (zVar2 != null) {
                    this.g.add(zVar2);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return kotlin.Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                            java.lang.String text2 = this.d.getText();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                    int hashCode = name.hashCode();
                    if (hashCode == -617879491) {
                        if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.y)) {
                            kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.e;
                            this.c = objectRef2;
                            this.f7733a = depth;
                            this.b = 1;
                            ?? U = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.U(xmlPullParser, this);
                            if (U == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef2.element = U;
                        }
                    } else if (hashCode == -135761801) {
                        if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.A)) {
                            this.c = null;
                            this.f7733a = depth;
                            this.b = 3;
                            java.lang.Object U2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.U(xmlPullParser, this);
                            obj3 = U2;
                            if (U2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar22 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z) obj3;
                            if (zVar22 != null) {
                            }
                        }
                    } else if (hashCode == 2107600959 && name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.z)) {
                        this.c = null;
                        this.f7733a = depth;
                        this.b = 2;
                        java.lang.Object U3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.U(xmlPullParser, this);
                        obj2 = U3;
                        if (U3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z) obj2;
                        if (zVar != null) {
                            this.f.add(zVar);
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0}, l = {941}, m = "parseVideoClicksTag", n = {"clickThrough", "clickTrackingList", "customClickList", "isInLineParent"}, s = {"L$0", "L$1", "L$2", "Z$0"})
    public static final class X extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7734a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public /* synthetic */ java.lang.Object e;
        public int f;

        public X(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.X> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.e = obj;
            this.f |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseWrapperTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1, 2, 3, 4}, l = {126, 127, 128, 129, 130}, m = "invokeSuspend", n = {"initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth"}, s = {"I$0", "I$0", "I$0", "I$0", "I$0"})
    public static final class Y extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7735a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef g;
        public final /* synthetic */ java.util.List h;
        public final /* synthetic */ java.util.List i;
        public final /* synthetic */ java.util.List j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Y(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2, kotlin.jvm.internal.Ref.ObjectRef objectRef3, java.util.List list, java.util.List list2, java.util.List list3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = list;
            this.i = list2;
            this.j = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Y) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Y y = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Y(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j);
            y.c = obj;
            return y;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x019b, code lost:
        
            r8.element = null;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
        /* JADX WARN: Type inference failed for: r11v44, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v45, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Boolean] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x008d -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0097 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009f -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a5 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b0 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c3 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c5 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d2 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e5 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e7 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f4 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0111 -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x012e -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x013c -> B:9:0x013f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x017d -> B:10:0x019b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0196 -> B:10:0x019b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.lang.Object obj2;
            java.lang.String str;
            java.lang.Object obj3;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar;
            java.lang.String text;
            org.xmlpull.v1.XmlPullParser xmlPullParser;
            java.lang.String name;
            java.lang.Object obj4;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    depth = this.f7735a;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef.element = obj;
                } else if (i == 2) {
                    depth = this.f7735a;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef2.element = obj;
                } else if (i == 3) {
                    depth = this.f7735a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj3;
                    if (nVar != null) {
                        this.h.add(nVar);
                    }
                } else if (i == 4) {
                    depth = this.f7735a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    str = (java.lang.String) obj2;
                    if (str != null) {
                        this.i.add(str);
                    }
                } else {
                    if (i != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    depth = this.f7735a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    this.j.addAll((java.util.List) obj4);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return kotlin.Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                        switch (name.hashCode()) {
                            case -1692490108:
                                if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o)) {
                                    this.c = null;
                                    this.f7735a = depth;
                                    this.b = 5;
                                    java.lang.Object f = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f(xmlPullParser, false, this);
                                    obj4 = f;
                                    if (f == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    this.j.addAll((java.util.List) obj4);
                                    break;
                                }
                                break;
                            case -1633884078:
                                if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h)) {
                                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = this.g;
                                    this.c = objectRef3;
                                    this.f7735a = depth;
                                    this.b = 2;
                                    ?? z = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.z(xmlPullParser, this);
                                    if (z != coroutine_suspended) {
                                        objectRef3.element = z;
                                        break;
                                    } else {
                                        return coroutine_suspended;
                                    }
                                }
                                break;
                            case -587420703:
                                if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g)) {
                                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = this.f;
                                    this.c = objectRef4;
                                    this.f7735a = depth;
                                    this.b = 1;
                                    ?? P = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(xmlPullParser, this);
                                    if (P != coroutine_suspended) {
                                        objectRef4.element = P;
                                        break;
                                    } else {
                                        return coroutine_suspended;
                                    }
                                }
                                break;
                            case 67232232:
                                if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c)) {
                                    this.c = null;
                                    this.f7735a = depth;
                                    this.b = 4;
                                    java.lang.Object D = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D(xmlPullParser, this);
                                    obj2 = D;
                                    if (D == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    str = (java.lang.String) obj2;
                                    if (str != null) {
                                    }
                                }
                                break;
                            case 2114088489:
                                if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n)) {
                                    this.c = null;
                                    this.f7735a = depth;
                                    this.b = 3;
                                    java.lang.Object J = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J(xmlPullParser, this);
                                    obj3 = J;
                                    if (J == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj3;
                                    if (nVar != null) {
                                    }
                                }
                                break;
                        }
                    }
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser2 = this.d;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef5 = this.e;
                    java.lang.String b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser2, "followAdditionalWrappers");
                    if (b != null) {
                    }
                    objectRef5.element = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(java.lang.Boolean.parseBoolean(b));
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                    java.lang.String text2 = this.d.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0, 0}, l = {941}, m = "parseWrapperTag", n = {"vastAdTagUrl", "followAdditionalWrappers", "adSystem", "impressions", "errorUrls", "creatives"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    public static final class Z extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7736a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public java.lang.Object f;
        public /* synthetic */ java.lang.Object g;
        public int h;

        public Z(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Z> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.g = obj;
            this.h |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.V(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$iterateTag$2", f = "VastParser.kt", i = {0, 1, 2}, l = {102, 103, 111}, m = "invokeSuspend", n = {"initialDepth", "initialDepth", "initialDepth"}, s = {"I$0", "I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$a, reason: case insensitive filesystem */
    public static final class C3465a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7737a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.functions.Function2<org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> e;
        public final /* synthetic */ kotlin.jvm.functions.Function3<org.xmlpull.v1.XmlPullParser, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> f;
        public final /* synthetic */ kotlin.jvm.functions.Function2<org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3465a(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.jvm.functions.Function2<? super org.xmlpull.v1.XmlPullParser, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function3<? super org.xmlpull.v1.XmlPullParser, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function2<? super org.xmlpull.v1.XmlPullParser, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3465a> continuation) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = function2;
            this.f = function3;
            this.g = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3465a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3465a c3465a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3465a(this.d, this.e, this.f, this.g, continuation);
            c3465a.c = obj;
            return c3465a;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0063 -> B:10:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006c -> B:10:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007a -> B:10:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0091 -> B:10:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c8 -> B:10:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d1 -> B:10:0x00d6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.lang.String text;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.f7737a;
                kotlin.ResultKt.throwOnFailure(obj);
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return kotlin.Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        kotlin.jvm.functions.Function2<org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.e;
                        org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                        this.f7737a = depth;
                        this.b = 1;
                        if (function2.invoke(xmlPullParser, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                        kotlin.jvm.functions.Function3<org.xmlpull.v1.XmlPullParser, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.f;
                        org.xmlpull.v1.XmlPullParser xmlPullParser2 = this.d;
                        java.lang.String text2 = xmlPullParser2.getText();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        java.lang.String obj2 = kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                        this.f7737a = depth;
                        this.b = 2;
                        if (function3.invoke(xmlPullParser2, obj2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                        return kotlin.Unit.INSTANCE;
                    }
                } else if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    kotlin.jvm.functions.Function2<org.xmlpull.v1.XmlPullParser, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function22 = this.g;
                    org.xmlpull.v1.XmlPullParser xmlPullParser3 = this.d;
                    this.f7737a = depth;
                    this.b = 3;
                    if (function22.invoke(xmlPullParser3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }

        public final java.lang.Object a(java.lang.Object obj) {
            java.lang.String text;
            kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                this.d.nextTag();
            }
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                return kotlin.Unit.INSTANCE;
            }
            if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        this.g.invoke(this.d, this);
                    }
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    this.e.invoke(this.d, this);
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                    kotlin.jvm.functions.Function3<org.xmlpull.v1.XmlPullParser, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.f;
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    java.lang.String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    function3.invoke(xmlPullParser, kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString(), this);
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                this.d.next();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseAdParametersTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$b, reason: case insensitive filesystem */
    public static final class C3466b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7738a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3466b(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3466b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3466b c3466b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3466b(this.d, continuation, this.e, this.f);
            c3466b.c = obj;
            return c3466b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String text;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                this.d.nextTag();
            }
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                return kotlin.Unit.INSTANCE;
            }
            if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d);
                    }
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef = this.e;
                    java.lang.String b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "xmlEncoded");
                    objectRef.element = b != null ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(java.lang.Boolean.parseBoolean(b)) : 0;
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                    java.lang.String text2 = this.d.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                this.d.next();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parseAdParametersTag", n = {"rawText", "isXmlEncoded"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$c, reason: case insensitive filesystem */
    public static final class C3467c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7739a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int d;

        public C3467c(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3467c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.y(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseAdSystemTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$d, reason: case insensitive filesystem */
    public static final class C3468d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7740a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3468d(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3468d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3468d c3468d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3468d(this.d, continuation, this.e, this.f);
            c3468d.c = obj;
            return c3468d;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String text;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                this.d.nextTag();
            }
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                return kotlin.Unit.INSTANCE;
            }
            if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d);
                    }
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    this.e.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(this.d, "version");
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                    java.lang.String text2 = this.d.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                this.d.next();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parseAdSystemTag", n = {"name", "version"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$e, reason: case insensitive filesystem */
    public static final class C3469e extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7741a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int d;

        public C3469e(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3469e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.z(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseAdTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1}, l = {126, 127}, m = "invokeSuspend", n = {"initialDepth", "initialDepth"}, s = {"I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$f, reason: case insensitive filesystem */
    public static final class C3470f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7742a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3470f(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2, kotlin.jvm.internal.Ref.ObjectRef objectRef3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3470f) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3470f c3470f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3470f(this.d, continuation, this.e, this.f, this.g);
            c3470f.c = obj;
            return c3470f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
        
            r6 = 0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00bc  */
        /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v10, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b$a] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b$a] */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b$b] */
        /* JADX WARN: Type inference failed for: r9v34, types: [T, java.lang.Integer] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006e -> B:10:0x0118). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:10:0x0118). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0080 -> B:10:0x0118). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b5 -> B:6:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ce -> B:10:0x0118). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fa -> B:10:0x0118). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0113 -> B:10:0x0118). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.lang.String text;
            kotlin.jvm.internal.Ref.ObjectRef objectRef;
            T t;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.f7742a;
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o) obj);
                objectRef.element = t;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.f7742a;
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B b = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B) obj;
                if (b != null) {
                    t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b.C0286b(b);
                    objectRef.element = t;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                        return kotlin.Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 == 0) {
                        if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                            org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                            this.e.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "id");
                            this.f.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.m(xmlPullParser);
                        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                            java.lang.String text2 = this.d.getText();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                            return kotlin.Unit.INSTANCE;
                        }
                    } else if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        org.xmlpull.v1.XmlPullParser xmlPullParser2 = this.d;
                        objectRef = this.g;
                        if (objectRef.element == 0) {
                            java.lang.String name = xmlPullParser2.getName();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e)) {
                                this.c = objectRef;
                                this.f7742a = depth;
                                this.b = 1;
                                java.lang.Object K = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K(xmlPullParser2, this);
                                if (K == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o) K);
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f)) {
                                this.c = objectRef;
                                this.f7742a = depth;
                                this.b = 2;
                                obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.V(xmlPullParser2, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B b2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B) obj;
                                if (b2 != null) {
                                }
                            }
                            objectRef.element = t;
                        }
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                }
                t = 0;
                objectRef.element = t;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0}, l = {941}, m = "parseAdTag", n = {"id", "sequence", "adChild"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$g, reason: case insensitive filesystem */
    public static final class C3471g extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7743a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int e;

        public C3471g(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3471g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.A(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCompanionAdsTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0}, l = {123}, m = "invokeSuspend", n = {"initialDepth"}, s = {"I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$h, reason: case insensitive filesystem */
    public static final class C3472h extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7744a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ java.util.List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3472h(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, java.util.List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3472h) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3472h c3472h = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3472h(this.d, continuation, this.e);
            c3472h.c = obj;
            return c3472h;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.lang.String text;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.f7744a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) obj;
                if (eVar != null) {
                    this.e.add(eVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return kotlin.Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                            java.lang.String text2 = this.d.getText();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M)) {
                        this.f7744a = depth;
                        this.b = 1;
                        obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C(xmlPullParser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) obj;
                        if (eVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0}, l = {941}, m = "parseCompanionAdsTag", n = {"companions"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$i, reason: case insensitive filesystem */
    public static final class C3473i extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7745a;
        public /* synthetic */ java.lang.Object b;
        public int c;

        public C3473i(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3473i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCompanionTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1, 2, 3, 4, 5, 6, 7}, l = {128, 130, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 136, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 141, 146, 147}, m = "invokeSuspend", n = {"initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth"}, s = {"I$0", "I$0", "I$0", "I$0", "I$0", "I$0", "I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$j, reason: case insensitive filesystem */
    public static final class C3474j extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7746a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef g;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef h;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef i;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef j;
        public final /* synthetic */ java.util.List k;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef l;
        public final /* synthetic */ java.util.List m;
        public final /* synthetic */ java.util.List n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3474j(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2, kotlin.jvm.internal.Ref.ObjectRef objectRef3, kotlin.jvm.internal.Ref.ObjectRef objectRef4, kotlin.jvm.internal.Ref.ObjectRef objectRef5, kotlin.jvm.internal.Ref.ObjectRef objectRef6, java.util.List list, kotlin.jvm.internal.Ref.ObjectRef objectRef7, java.util.List list2, java.util.List list3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = objectRef4;
            this.i = objectRef5;
            this.j = objectRef6;
            this.k = list;
            this.l = objectRef7;
            this.m = list2;
            this.n = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3474j) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3474j c3474j = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3474j(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
            c3474j.c = obj;
            return c3474j;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0268, code lost:
        
            r3.element = null;
            r7.h.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(r8, "apiFramework");
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:109:0x026f  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00ff  */
        /* JADX WARN: Type inference failed for: r2v15, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v43, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v44, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v48, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v50, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v53, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0263 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009d -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a7 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00af -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b5 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c0 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d4 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d6 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e8 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f8 -> B:7:0x00fb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x010c -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x012a -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x013d -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x013f -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0151 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0189 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0194 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01b2 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01c6 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01c8 -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01da -> B:10:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x024a -> B:10:0x0268). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.util.List list;
            java.lang.Object obj2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k kVar;
            java.lang.Object obj3;
            java.lang.Object obj4;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar;
            java.lang.Object obj5;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVar;
            java.lang.String text;
            org.xmlpull.v1.XmlPullParser xmlPullParser;
            java.lang.String name;
            java.lang.Object obj6;
            java.lang.String str;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.b) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                    if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                        this.d.nextTag();
                    }
                    if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                    }
                    depth = this.d.getDepth();
                    if (this.d.getDepth() < depth) {
                        return kotlin.Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 != 0) {
                        if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                            switch (name.hashCode()) {
                                case -1348833651:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.r)) {
                                        kotlin.jvm.internal.Ref.ObjectRef objectRef = this.j;
                                        this.c = objectRef;
                                        this.f7746a = depth;
                                        this.b = 5;
                                        ?? y = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.y(xmlPullParser, this);
                                        if (y == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        objectRef.element = y;
                                        break;
                                    }
                                    break;
                                case -375340334:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E)) {
                                        this.c = null;
                                        this.f7746a = depth;
                                        this.b = 3;
                                        java.lang.Object F = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F(xmlPullParser, this);
                                        obj2 = F;
                                        if (F == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) obj2;
                                        if (kVar != null) {
                                            this.m.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.b(kVar));
                                            break;
                                        }
                                    }
                                    break;
                                case -348198615:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N)) {
                                        kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.l;
                                        this.c = objectRef2;
                                        this.f7746a = depth;
                                        this.b = 7;
                                        ?? P = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(xmlPullParser, this);
                                        if (P == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        objectRef2.element = P;
                                        break;
                                    }
                                    break;
                                case 611554000:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v)) {
                                        list = this.k;
                                        this.c = list;
                                        this.f7746a = depth;
                                        this.b = 6;
                                        java.lang.Object Q = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Q(xmlPullParser, this);
                                        obj3 = Q;
                                        if (Q == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        for (java.lang.Object obj7 : (java.lang.Iterable) obj3) {
                                            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u) obj7).d() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f7788a) {
                                                arrayList.add(obj7);
                                            }
                                        }
                                        list.addAll(arrayList);
                                        break;
                                    }
                                    break;
                                case 676623548:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D)) {
                                        this.c = null;
                                        this.f7746a = depth;
                                        this.b = 1;
                                        java.lang.Object O = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O(xmlPullParser, this);
                                        obj4 = O;
                                        if (O == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        tVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t) obj4;
                                        if (tVar != null) {
                                            this.m.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c(tVar));
                                            break;
                                        }
                                    }
                                    break;
                                case 759877206:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K)) {
                                        kotlin.jvm.internal.Ref.ObjectRef objectRef3 = this.i;
                                        this.c = objectRef3;
                                        this.f7746a = depth;
                                        this.b = 4;
                                        ?? P2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(xmlPullParser, this);
                                        if (P2 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        objectRef3.element = P2;
                                        break;
                                    }
                                    break;
                                case 1877773523:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O)) {
                                        this.c = null;
                                        this.f7746a = depth;
                                        this.b = 8;
                                        java.lang.Object P3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(xmlPullParser, this);
                                        obj6 = P3;
                                        if (P3 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        str = (java.lang.String) obj6;
                                        if (str != null) {
                                            this.n.add(str);
                                            break;
                                        }
                                    }
                                    break;
                                case 1928285401:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F)) {
                                        this.c = null;
                                        this.f7746a = depth;
                                        this.b = 2;
                                        java.lang.Object E = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E(xmlPullParser, this);
                                        obj5 = E;
                                        if (E == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj5;
                                        if (jVar != null) {
                                            this.m.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.a(jVar));
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        org.xmlpull.v1.XmlPullParser xmlPullParser2 = this.d;
                        this.e.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser2, "id");
                        kotlin.jvm.internal.Ref.ObjectRef objectRef4 = this.f;
                        java.lang.String b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser2, "width");
                        objectRef4.element = b != null ? kotlin.text.StringsKt.toIntOrNull(b) : 0;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef5 = this.g;
                        java.lang.String b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser2, "height");
                        if (b2 != null) {
                        }
                        objectRef5.element = kotlin.text.StringsKt.toIntOrNull(b2);
                        this.h.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser2, "apiFramework");
                    } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                        java.lang.String text2 = this.d.getText();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                    } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 1:
                    depth = this.f7746a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    tVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t) obj4;
                    if (tVar != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 2:
                    depth = this.f7746a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj5 = obj;
                    jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj5;
                    if (jVar != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 3:
                    depth = this.f7746a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) obj2;
                    if (kVar != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 4:
                    depth = this.f7746a;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef6 = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef6.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 5:
                    depth = this.f7746a;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef7 = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef7.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 6:
                    depth = this.f7746a;
                    list = (java.util.List) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (r8.hasNext()) {
                    }
                    list.addAll(arrayList2);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 7:
                    depth = this.f7746a;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef8.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 8:
                    depth = this.f7746a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj6 = obj;
                    str = (java.lang.String) obj6;
                    if (str != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {941}, m = "parseCompanionTag", n = {"id", "widthPx", "heightPx", "altText", "apiFramework", "adParameters", "creativeViewTrackingList", "resources", "clickThroughUrl", "clickTrackingList"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$k, reason: collision with other inner class name */
    public static final class C0285k extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7747a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public java.lang.Object f;
        public java.lang.Object g;
        public java.lang.Object h;
        public java.lang.Object i;
        public java.lang.Object j;
        public /* synthetic */ java.lang.Object k;
        public int l;

        public C0285k(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C0285k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.k = obj;
            this.l |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCreativeTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1}, l = {129, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend", n = {"initialDepth", "initialDepth"}, s = {"I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$l, reason: case insensitive filesystem */
    public static final class C3475l extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7748a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef g;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef h;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef i;
        public final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3475l(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2, kotlin.jvm.internal.Ref.ObjectRef objectRef3, kotlin.jvm.internal.Ref.ObjectRef objectRef4, kotlin.jvm.internal.Ref.ObjectRef objectRef5, boolean z) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = objectRef4;
            this.i = objectRef5;
            this.j = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3475l) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3475l c3475l = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3475l(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j);
            c3475l.c = obj;
            return c3475l;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00c8  */
        /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v36, types: [T, java.lang.String] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006f -> B:13:0x013d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0079 -> B:13:0x013d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0081 -> B:13:0x013d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a2 -> B:12:0x00d4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ba -> B:6:0x00bd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00df -> B:13:0x013d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011f -> B:13:0x013d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0138 -> B:13:0x013d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00d3 -> B:12:0x00d4). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            kotlin.jvm.internal.Ref.ObjectRef objectRef;
            T t;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p pVar;
            java.lang.String text;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.f7748a;
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                pVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p) obj;
                if (pVar != null) {
                }
                t = 0;
                objectRef.element = t;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.f7748a;
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                if (!(!((java.util.List) obj).isEmpty())) {
                    obj = null;
                }
                java.util.List list = (java.util.List) obj;
                if (list != null) {
                    t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h.a(list);
                    objectRef.element = t;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                        return kotlin.Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 == 0) {
                        if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                            org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                            this.e.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "id");
                            this.f.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.m(xmlPullParser);
                            this.g.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "adID");
                            this.h.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser, "apiFramework");
                        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                            java.lang.String text2 = this.d.getText();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                            return kotlin.Unit.INSTANCE;
                        }
                    } else if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        org.xmlpull.v1.XmlPullParser xmlPullParser2 = this.d;
                        objectRef = this.i;
                        if (objectRef.element == 0) {
                            java.lang.String name = xmlPullParser2.getName();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q)) {
                                boolean z = this.j;
                                this.c = objectRef;
                                this.f7748a = depth;
                                this.b = 1;
                                obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g(xmlPullParser2, z, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                pVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p) obj;
                                if (pVar != null) {
                                    t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h.b(pVar);
                                    objectRef.element = t;
                                }
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L)) {
                                this.c = objectRef;
                                this.f7748a = depth;
                                this.b = 2;
                                obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B(xmlPullParser2, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (!(!((java.util.List) obj).isEmpty())) {
                                }
                                java.util.List list2 = (java.util.List) obj;
                                if (list2 != null) {
                                }
                            }
                        }
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                }
                t = 0;
                objectRef.element = t;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0}, l = {941}, m = "parseCreativeTag", n = {"id", "sequence", com.ironsource.sdk.controller.f.b.c, "apiFramework", "child"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$m, reason: case insensitive filesystem */
    public static final class C3476m extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7749a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public /* synthetic */ java.lang.Object f;
        public int g;

        public C3476m(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3476m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f = obj;
            this.g |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCreativesTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0}, l = {123}, m = "invokeSuspend", n = {"initialDepth"}, s = {"I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$n, reason: case insensitive filesystem */
    public static final class C3477n extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7750a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ java.util.List f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3477n(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, boolean z, java.util.List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = z;
            this.f = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3477n) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3477n c3477n = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3477n(this.d, continuation, this.e, this.f);
            c3477n.c = obj;
            return c3477n;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0086  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0065 -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007f -> B:5:0x0082). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0092 -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ac -> B:8:0x00ca). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c5 -> B:8:0x00ca). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.lang.String text;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.f7750a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) obj;
                if (gVar != null) {
                    this.f.add(gVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return kotlin.Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                            java.lang.String text2 = this.d.getText();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p)) {
                        boolean z = this.e;
                        this.f7750a = depth;
                        this.b = 1;
                        obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e(xmlPullParser, z, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) obj;
                        if (gVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0}, l = {941}, m = "parseCreativesTag", n = {"creatives"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$o, reason: case insensitive filesystem */
    public static final class C3478o extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7751a;
        public /* synthetic */ java.lang.Object b;
        public int c;

        public C3478o(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3478o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {}, l = {799}, m = "parseHtmlResourceTag", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$p, reason: case insensitive filesystem */
    public static final class C3479p extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ java.lang.Object f7752a;
        public int b;

        public C3479p(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3479p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f7752a = obj;
            this.b |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {}, l = {802}, m = "parseIFrameResourceTag", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$q, reason: case insensitive filesystem */
    public static final class C3480q extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ java.lang.Object f7753a;
        public int b;

        public C3480q(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3480q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f7753a = obj;
            this.b |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseIconClicksTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1}, l = {123, 124}, m = "invokeSuspend", n = {"initialDepth", "initialDepth"}, s = {"I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$r, reason: case insensitive filesystem */
    public static final class C3481r extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7754a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ java.util.List f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3481r(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, java.util.List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3481r) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3481r c3481r = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3481r(this.d, continuation, this.e, this.f);
            c3481r.c = obj;
            return c3481r;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00af  */
        /* JADX WARN: Type inference failed for: r7v37, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0069 -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009b -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a8 -> B:6:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00bb -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d5 -> B:9:0x00f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ee -> B:9:0x00f3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.lang.String text;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.f7754a;
                kotlin.jvm.internal.Ref.ObjectRef objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                objectRef.element = obj;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.f7754a;
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Object obj2 = obj;
                java.lang.String str = (java.lang.String) obj2;
                if (str != null) {
                    this.f.add(str);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return kotlin.Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                            java.lang.String text2 = this.d.getText();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    java.lang.String name = xmlPullParser.getName();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H)) {
                        kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.e;
                        this.c = objectRef2;
                        this.f7754a = depth;
                        this.b = 1;
                        ?? P = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(xmlPullParser, this);
                        if (P == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef2.element = P;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I)) {
                        this.c = null;
                        this.f7754a = depth;
                        this.b = 2;
                        java.lang.Object P2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(xmlPullParser, this);
                        obj2 = P2;
                        if (P2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        java.lang.String str2 = (java.lang.String) obj2;
                        if (str2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parseIconClicksTag", n = {"clickThroughUrl", "clickTrackingUrlList"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$s, reason: case insensitive filesystem */
    public static final class C3482s extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7755a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int d;

        public C3482s(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3482s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseIconTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 0, 1, 1, 2, 2, 3, 4}, l = {130, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 140}, m = "invokeSuspend", n = {"$this$parseIconTag_u24lambda_u2498", "initialDepth", "$this$parseIconTag_u24lambda_u2498", "initialDepth", "$this$parseIconTag_u24lambda_u2498", "initialDepth", "initialDepth", "initialDepth"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$t, reason: case insensitive filesystem */
    public static final class C3483t extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7756a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef g;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef h;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef i;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef j;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef k;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef l;
        public final /* synthetic */ java.util.List m;
        public java.lang.Object n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3483t(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2, kotlin.jvm.internal.Ref.ObjectRef objectRef3, kotlin.jvm.internal.Ref.ObjectRef objectRef4, kotlin.jvm.internal.Ref.ObjectRef objectRef5, kotlin.jvm.internal.Ref.ObjectRef objectRef6, kotlin.jvm.internal.Ref.ObjectRef objectRef7, kotlin.jvm.internal.Ref.ObjectRef objectRef8, java.util.List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = objectRef4;
            this.i = objectRef5;
            this.j = objectRef6;
            this.k = objectRef7;
            this.l = objectRef8;
            this.m = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3483t) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3483t c3483t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3483t(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            c3483t.c = obj;
            return c3483t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x021d  */
        /* JADX WARN: Type inference failed for: r13v17, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v46, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r9v17, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v7, types: [T, java.lang.String] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a1 -> B:12:0x0216). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00ab -> B:12:0x0216). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x015e -> B:12:0x0216). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016c -> B:9:0x016f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01f8 -> B:12:0x0216). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0211 -> B:12:0x0216). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            org.xmlpull.v1.XmlPullParser xmlPullParser;
            java.lang.String name;
            kotlin.jvm.internal.Ref.ObjectRef objectRef;
            T t;
            java.lang.Object obj2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k kVar;
            java.lang.Object obj3;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar;
            java.lang.Object obj4;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVar;
            java.lang.String text;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 1) {
                depth = this.f7756a;
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.n;
                xmlPullParser = (org.xmlpull.v1.XmlPullParser) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                obj3 = obj;
                tVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t) obj3;
                if (tVar != null) {
                }
                t = 0;
                objectRef.element = t;
                name = xmlPullParser.getName();
                if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G)) {
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 2) {
                depth = this.f7756a;
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.n;
                xmlPullParser = (org.xmlpull.v1.XmlPullParser) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                obj4 = obj;
                jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj4;
                if (jVar != null) {
                }
                t = 0;
                objectRef.element = t;
                name = xmlPullParser.getName();
                if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G)) {
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 3) {
                depth = this.f7756a;
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.n;
                xmlPullParser = (org.xmlpull.v1.XmlPullParser) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj;
                kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) obj2;
                if (kVar != null) {
                }
                t = 0;
                objectRef.element = t;
                name = xmlPullParser.getName();
                if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G)) {
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else if (i == 4) {
                depth = this.f7756a;
                kotlin.jvm.internal.Ref.ObjectRef objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                objectRef2.element = obj;
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.f7756a;
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Object obj5 = obj;
                java.lang.String str = (java.lang.String) obj5;
                if (str != null) {
                    this.m.add(str);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return kotlin.Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        org.xmlpull.v1.XmlPullParser xmlPullParser2 = this.d;
                        this.e.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser2, "program");
                        kotlin.jvm.internal.Ref.ObjectRef objectRef3 = this.f;
                        java.lang.String b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser2, "width");
                        objectRef3.element = b != null ? kotlin.text.StringsKt.toIntOrNull(b) : 0;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef4 = this.g;
                        java.lang.String b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser2, "height");
                        objectRef4.element = b2 != null ? kotlin.text.StringsKt.toIntOrNull(b2) : 0;
                        this.h.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser2, "apiFramework");
                        kotlin.jvm.internal.Ref.ObjectRef objectRef5 = this.i;
                        java.lang.String b3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser2, "offset");
                        objectRef5.element = b3 != null ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g(b3) : 0;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef6 = this.j;
                        java.lang.String b4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(xmlPullParser2, com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION);
                        if (b4 != null) {
                            objectRef6.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f(b4);
                        } else {
                            objectRef6.element = null;
                        }
                    } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                        java.lang.String text2 = this.d.getText();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                    } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                        return kotlin.Unit.INSTANCE;
                    }
                } else if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    xmlPullParser = this.d;
                    objectRef = this.k;
                    if (objectRef.element == 0) {
                        java.lang.String name2 = xmlPullParser.getName();
                        if (name2 != null) {
                            int hashCode = name2.hashCode();
                            if (hashCode == -375340334) {
                                if (name2.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E)) {
                                    this.c = xmlPullParser;
                                    this.n = objectRef;
                                    this.f7756a = depth;
                                    this.b = 3;
                                    java.lang.Object F = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F(xmlPullParser, this);
                                    obj2 = F;
                                    if (F == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) obj2;
                                    if (kVar != null) {
                                        t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.b(kVar);
                                        objectRef.element = t;
                                    }
                                }
                            } else if (hashCode == 676623548) {
                                if (name2.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D)) {
                                    this.c = xmlPullParser;
                                    this.n = objectRef;
                                    this.f7756a = depth;
                                    this.b = 1;
                                    java.lang.Object O = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O(xmlPullParser, this);
                                    obj3 = O;
                                    if (O == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    tVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t) obj3;
                                    if (tVar != null) {
                                        t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c(tVar);
                                        objectRef.element = t;
                                    }
                                }
                            } else if (hashCode == 1928285401 && name2.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F)) {
                                this.c = xmlPullParser;
                                this.n = objectRef;
                                this.f7756a = depth;
                                this.b = 2;
                                java.lang.Object E = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E(xmlPullParser, this);
                                obj4 = E;
                                if (E == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj4;
                                if (jVar != null) {
                                    t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.a(jVar);
                                    objectRef.element = t;
                                }
                            }
                        }
                        t = 0;
                        objectRef.element = t;
                    }
                    name = xmlPullParser.getName();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G)) {
                        kotlin.jvm.internal.Ref.ObjectRef objectRef7 = this.l;
                        this.c = objectRef7;
                        this.n = null;
                        this.f7756a = depth;
                        this.b = 4;
                        ?? G = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G(xmlPullParser, this);
                        if (G == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef7.element = G;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J)) {
                        this.c = null;
                        this.n = null;
                        this.f7756a = depth;
                        this.b = 5;
                        java.lang.Object P = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(xmlPullParser, this);
                        obj5 = P;
                        if (P == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        java.lang.String str2 = (java.lang.String) obj5;
                        if (str2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {941}, m = "parseIconTag", n = {"program", "widthPx", "heightPx", "apiFramework", "offset", "durationMillis", "clicks", "resource", "viewTrackingUrlList"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$u, reason: case insensitive filesystem */
    public static final class C3484u extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7757a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public java.lang.Object f;
        public java.lang.Object g;
        public java.lang.Object h;
        public java.lang.Object i;
        public /* synthetic */ java.lang.Object j;
        public int k;

        public C3484u(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3484u> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.j = obj;
            this.k |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseIconsTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0}, l = {123}, m = "invokeSuspend", n = {"initialDepth"}, s = {"I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$v, reason: case insensitive filesystem */
    public static final class C3485v extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7758a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ java.util.List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3485v(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, java.util.List list) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3485v) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3485v c3485v = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3485v(this.d, continuation, this.e);
            c3485v.c = obj;
            return c3485v;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a9 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:8:0x00c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.lang.String text;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                    this.d.nextTag();
                }
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                }
                depth = this.d.getDepth();
                if (this.d.getDepth() < depth) {
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                depth = this.f7758a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) obj;
                if (lVar != null) {
                    this.e.add(lVar);
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                    return kotlin.Unit.INSTANCE;
                }
                int depth2 = this.d.getDepth() - depth;
                if (depth2 == 0) {
                    if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                            java.lang.String text2 = this.d.getText();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                } else if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    org.xmlpull.v1.XmlPullParser xmlPullParser = this.d;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C)) {
                        this.f7758a = depth;
                        this.b = 1;
                        obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H(xmlPullParser, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l lVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) obj;
                        if (lVar2 != null) {
                        }
                    }
                }
                this.d.next();
                if (this.d.getDepth() < depth) {
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0}, l = {941}, m = "parseIconsTag", n = {"icons"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$w, reason: case insensitive filesystem */
    public static final class C3486w extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7759a;
        public /* synthetic */ java.lang.Object b;
        public int c;

        public C3486w(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3486w> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseImpressionTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$x, reason: case insensitive filesystem */
    public static final class C3487x extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7760a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3487x(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3487x) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3487x c3487x = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3487x(this.d, continuation, this.e, this.f);
            c3487x.c = obj;
            return c3487x;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String text;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                this.d.nextTag();
            }
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                return kotlin.Unit.INSTANCE;
            }
            if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.d.getDepth();
            while (this.d.getDepth() >= depth) {
                int depth2 = this.d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d);
                    }
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                    this.e.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(this.d, "id");
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                    java.lang.String text2 = this.d.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                    this.f.element = kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                    return kotlin.Unit.INSTANCE;
                }
                this.d.next();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", i = {0, 0}, l = {941}, m = "parseImpressionTag", n = {"id", "impressionUrl"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$y, reason: case insensitive filesystem */
    public static final class C3488y extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7761a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int d;

        public C3488y(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3488y> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseInLineTag$$inlined$iterateTag$1", f = "VastParser.kt", i = {0, 1, 2, 3, 4, 5, 6, 7}, l = {123, 124, 125, 126, 127, 128, 130, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend", n = {"initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth", "initialDepth"}, s = {"I$0", "I$0", "I$0", "I$0", "I$0", "I$0", "I$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$z, reason: case insensitive filesystem */
    public static final class C3489z extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7762a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ org.xmlpull.v1.XmlPullParser d;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef f;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef g;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef h;
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef i;
        public final /* synthetic */ java.util.List j;
        public final /* synthetic */ java.util.List k;
        public final /* synthetic */ java.util.List l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3489z(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2, kotlin.jvm.internal.Ref.ObjectRef objectRef3, kotlin.jvm.internal.Ref.ObjectRef objectRef4, kotlin.jvm.internal.Ref.ObjectRef objectRef5, java.util.List list, java.util.List list2, java.util.List list3) {
            super(2, continuation);
            this.d = xmlPullParser;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = objectRef3;
            this.h = objectRef4;
            this.i = objectRef5;
            this.j = list;
            this.k = list2;
            this.l = list3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3489z) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3489z c3489z = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3489z(this.d, continuation, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            c3489z.c = obj;
            return c3489z;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01fe  */
        /* JADX WARN: Type inference failed for: r7v41, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v42, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v44, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v45, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v46, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00a0 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00aa -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b2 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b9 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c4 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d8 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00da -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e7 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0105 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0123 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0141 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0155 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0157 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0164 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0182 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x019f -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01ae -> B:7:0x01b1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01bf -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01d9 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01f2 -> B:8:0x01f7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int depth;
            java.lang.Object obj2;
            java.lang.String str;
            java.lang.Object obj3;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar;
            java.lang.String text;
            org.xmlpull.v1.XmlPullParser xmlPullParser;
            java.lang.String name;
            java.lang.Object obj4;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.b) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.c);
                    if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(this.d)) {
                        this.d.nextTag();
                    }
                    if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(this.d)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        throw new org.xmlpull.v1.XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
                    }
                    depth = this.d.getDepth();
                    if (this.d.getDepth() < depth) {
                        return kotlin.Unit.INSTANCE;
                    }
                    int depth2 = this.d.getDepth() - depth;
                    if (depth2 != 0) {
                        if (depth2 == 1 && com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d) && (name = (xmlPullParser = this.d).getName()) != null) {
                            switch (name.hashCode()) {
                                case -1692490108:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o)) {
                                        this.c = null;
                                        this.f7762a = depth;
                                        this.b = 8;
                                        java.lang.Object f = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f(xmlPullParser, true, this);
                                        obj4 = f;
                                        if (f == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        this.l.addAll((java.util.List) obj4);
                                        break;
                                    }
                                    break;
                                case -1633884078:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h)) {
                                        kotlin.jvm.internal.Ref.ObjectRef objectRef = this.e;
                                        this.c = objectRef;
                                        this.f7762a = depth;
                                        this.b = 1;
                                        ?? z = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.z(xmlPullParser, this);
                                        if (z != coroutine_suspended) {
                                            objectRef.element = z;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case -56677412:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j)) {
                                        kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.g;
                                        this.c = objectRef2;
                                        this.f7762a = depth;
                                        this.b = 3;
                                        ?? P = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(xmlPullParser, this);
                                        if (P != coroutine_suspended) {
                                            objectRef2.element = P;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 67232232:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c)) {
                                        this.c = null;
                                        this.f7762a = depth;
                                        this.b = 7;
                                        java.lang.Object D = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D(xmlPullParser, this);
                                        obj2 = D;
                                        if (D == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        str = (java.lang.String) obj2;
                                        if (str != null) {
                                            this.k.add(str);
                                            break;
                                        }
                                    }
                                    break;
                                case 501930965:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i)) {
                                        kotlin.jvm.internal.Ref.ObjectRef objectRef3 = this.f;
                                        this.c = objectRef3;
                                        this.f7762a = depth;
                                        this.b = 2;
                                        ?? P2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(xmlPullParser, this);
                                        if (P2 != coroutine_suspended) {
                                            objectRef3.element = P2;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 1349597094:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l)) {
                                        kotlin.jvm.internal.Ref.ObjectRef objectRef4 = this.i;
                                        this.c = objectRef4;
                                        this.f7762a = depth;
                                        this.b = 5;
                                        ?? N = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N(xmlPullParser, this);
                                        if (N != coroutine_suspended) {
                                            objectRef4.element = N;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 2065545547:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k)) {
                                        kotlin.jvm.internal.Ref.ObjectRef objectRef5 = this.h;
                                        this.c = objectRef5;
                                        this.f7762a = depth;
                                        this.b = 4;
                                        ?? P3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(xmlPullParser, this);
                                        if (P3 != coroutine_suspended) {
                                            objectRef5.element = P3;
                                            break;
                                        } else {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 2114088489:
                                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n)) {
                                        this.c = null;
                                        this.f7762a = depth;
                                        this.b = 6;
                                        java.lang.Object J = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J(xmlPullParser, this);
                                        obj3 = J;
                                        if (J == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj3;
                                        if (nVar != null) {
                                            this.j.add(nVar);
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    } else if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(this.d)) {
                        if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(this.d) && (text = this.d.getText()) != null && !kotlin.text.StringsKt.isBlank(text)) {
                            java.lang.String text2 = this.d.getText();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                            kotlin.text.StringsKt.trim((java.lang.CharSequence) text2).toString();
                        } else if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(this.d)) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 1:
                    depth = this.f7762a;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef6 = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef6.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 2:
                    depth = this.f7762a;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef7 = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef7.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 3:
                    depth = this.f7762a;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef8.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 4:
                    depth = this.f7762a;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef9 = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef9.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 5:
                    depth = this.f7762a;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef10 = (kotlin.jvm.internal.Ref.ObjectRef) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef10.element = obj;
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 6:
                    depth = this.f7762a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj3;
                    if (nVar != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 7:
                    depth = this.f7762a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    str = (java.lang.String) obj2;
                    if (str != null) {
                    }
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                case 8:
                    depth = this.f7762a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj4 = obj;
                    this.l.addAll((java.util.List) obj4);
                    this.d.next();
                    if (this.d.getDepth() < depth) {
                    }
                    break;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object A(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C3490a> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3471g c3471g;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b abstractC3491b;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3471g) {
            c3471g = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3471g) continuation;
            int i3 = c3471g.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3471g.e = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c3471g.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3471g.e;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef5 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef6 = new kotlin.jvm.internal.Ref.ObjectRef();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3470f c3470f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3470f(xmlPullParser, null, objectRef4, objectRef5, objectRef6);
                    c3471g.f7743a = objectRef4;
                    c3471g.b = objectRef5;
                    c3471g.c = objectRef6;
                    c3471g.e = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3470f, c3471g) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef4;
                    objectRef2 = objectRef5;
                    objectRef3 = objectRef6;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) c3471g.c;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) c3471g.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c3471g.f7743a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                abstractC3491b = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b) objectRef3.element;
                if (abstractC3491b == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C3490a((java.lang.String) objectRef.element, (java.lang.Integer) objectRef2.element, abstractC3491b);
                }
                return null;
            }
        }
        c3471g = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3471g(continuation);
        java.lang.Object obj2 = c3471g.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3471g.e;
        if (i2 != 0) {
        }
        abstractC3491b = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b) objectRef3.element;
        if (abstractC3491b == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object B(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3473i c3473i;
        int i2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3473i) {
            c3473i = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3473i) continuation;
            int i3 = c3473i.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3473i.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c3473i.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3473i.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.List list = (java.util.List) c3473i.f7745a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return list;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3472h c3472h = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3472h(xmlPullParser, null, arrayList);
                c3473i.f7745a = arrayList;
                c3473i.c = 1;
                return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3472h, c3473i) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        c3473i = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3473i(continuation);
        java.lang.Object obj2 = c3473i.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3473i.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object C(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C0285k c0285k;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.List list;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef6;
        kotlin.jvm.internal.Ref.ObjectRef objectRef7;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C0285k) {
            c0285k = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C0285k) continuation;
            int i3 = c0285k.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0285k.l = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c0285k.k;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0285k.l;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef8 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef9 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef10 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef11 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef12 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef13 = new kotlin.jvm.internal.Ref.ObjectRef();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef14 = new kotlin.jvm.internal.Ref.ObjectRef();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3474j c3474j = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3474j(xmlPullParser, null, objectRef8, objectRef9, objectRef10, objectRef12, objectRef11, objectRef13, arrayList3, objectRef14, arrayList4, arrayList5);
                    c0285k.f7747a = objectRef8;
                    c0285k.b = objectRef9;
                    c0285k.c = objectRef10;
                    c0285k.d = objectRef11;
                    c0285k.e = objectRef12;
                    c0285k.f = objectRef13;
                    c0285k.g = arrayList3;
                    c0285k.h = arrayList4;
                    c0285k.i = objectRef14;
                    c0285k.j = arrayList5;
                    c0285k.l = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3474j, c0285k) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef8;
                    arrayList = arrayList3;
                    arrayList2 = arrayList4;
                    list = arrayList5;
                    objectRef2 = objectRef10;
                    objectRef3 = objectRef11;
                    objectRef4 = objectRef13;
                    objectRef5 = objectRef12;
                    objectRef6 = objectRef9;
                    objectRef7 = objectRef14;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (java.util.List) c0285k.j;
                    objectRef7 = (kotlin.jvm.internal.Ref.ObjectRef) c0285k.i;
                    ?? r4 = (java.util.List) c0285k.h;
                    ?? r5 = (java.util.List) c0285k.g;
                    objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) c0285k.f;
                    objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) c0285k.e;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) c0285k.d;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) c0285k.c;
                    objectRef6 = (kotlin.jvm.internal.Ref.ObjectRef) c0285k.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c0285k.f7747a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrayList2 = r4;
                    arrayList = r5;
                }
                java.lang.String str = (java.lang.String) objectRef7.element;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f fVar = str == null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f(str, list) : null;
                if (arrayList2.isEmpty()) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e((java.lang.String) objectRef.element, (java.lang.Integer) objectRef6.element, (java.lang.Integer) objectRef2.element, (java.lang.String) objectRef3.element, (java.lang.String) objectRef5.element, fVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) objectRef4.element, arrayList, arrayList2);
                }
                return null;
            }
        }
        c0285k = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C0285k(continuation);
        java.lang.Object obj2 = c0285k.k;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0285k.l;
        if (i2 != 0) {
        }
        java.lang.String str2 = (java.lang.String) objectRef7.element;
        if (str2 == null) {
        }
        if (arrayList2.isEmpty()) {
        }
    }

    public static final java.lang.Object D(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return P(xmlPullParser, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object E(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3479p c3479p;
        int i2;
        java.lang.String str;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3479p) {
            c3479p = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3479p) continuation;
            int i3 = c3479p.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3479p.b = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c3479p.f7752a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3479p.b;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    c3479p.b = 1;
                    obj = P(xmlPullParser, c3479p);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j(str);
                }
                return null;
            }
        }
        c3479p = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3479p(continuation);
        java.lang.Object obj2 = c3479p.f7752a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3479p.b;
        if (i2 != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object F(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3480q c3480q;
        int i2;
        java.lang.String str;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3480q) {
            c3480q = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3480q) continuation;
            int i3 = c3480q.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3480q.b = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c3480q.f7753a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3480q.b;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    c3480q.b = 1;
                    obj = P(xmlPullParser, c3480q);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k(str);
                }
                return null;
            }
        }
        c3480q = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3480q(continuation);
        java.lang.Object obj2 = c3480q.f7753a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3480q.b;
        if (i2 != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object G(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3482s c3482s;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.util.List list;
        java.lang.String str;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3482s) {
            c3482s = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3482s) continuation;
            int i3 = c3482s.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3482s.d = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c3482s.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3482s.d;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3481r c3481r = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3481r(xmlPullParser, null, objectRef2, arrayList);
                    c3482s.f7755a = objectRef2;
                    c3482s.b = arrayList;
                    c3482s.d = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3481r, c3482s) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                    list = arrayList;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (java.util.List) c3482s.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c3482s.f7755a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) objectRef.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m(str, list);
                }
                return null;
            }
        }
        c3482s = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3482s(continuation);
        java.lang.Object obj2 = c3482s.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3482s.d;
        if (i2 != 0) {
        }
        str = (java.lang.String) objectRef.element;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object H(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3484u c3484u;
        int i2;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef6;
        kotlin.jvm.internal.Ref.ObjectRef objectRef7;
        kotlin.jvm.internal.Ref.ObjectRef objectRef8;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3484u) {
            c3484u = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3484u) continuation;
            int i3 = c3484u.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3484u.k = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c3484u.j;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3484u.k;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef9 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef10 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef11 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef12 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef13 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef14 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef15 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef16 = new kotlin.jvm.internal.Ref.ObjectRef();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3483t c3483t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3483t(xmlPullParser, null, objectRef9, objectRef10, objectRef11, objectRef12, objectRef13, objectRef14, objectRef16, objectRef15, arrayList2);
                    c3484u.f7757a = objectRef9;
                    c3484u.b = objectRef10;
                    c3484u.c = objectRef11;
                    c3484u.d = objectRef12;
                    c3484u.e = objectRef13;
                    c3484u.f = objectRef14;
                    c3484u.g = objectRef15;
                    c3484u.h = objectRef16;
                    arrayList = arrayList2;
                    c3484u.i = arrayList;
                    c3484u.k = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3483t, c3484u) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef9;
                    objectRef2 = objectRef10;
                    objectRef3 = objectRef16;
                    objectRef4 = objectRef13;
                    objectRef5 = objectRef15;
                    objectRef6 = objectRef11;
                    objectRef7 = objectRef14;
                    objectRef8 = objectRef12;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r2 = (java.util.List) c3484u.i;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) c3484u.h;
                    objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) c3484u.g;
                    objectRef7 = (kotlin.jvm.internal.Ref.ObjectRef) c3484u.f;
                    objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) c3484u.e;
                    objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) c3484u.d;
                    objectRef6 = (kotlin.jvm.internal.Ref.ObjectRef) c3484u.c;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) c3484u.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c3484u.f7757a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrayList = r2;
                }
                yVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) objectRef3.element;
                if (yVar == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l((java.lang.String) objectRef.element, (java.lang.Integer) objectRef2.element, (java.lang.Integer) objectRef6.element, (java.lang.String) objectRef8.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r) objectRef4.element, (java.lang.Long) objectRef7.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m) objectRef5.element, arrayList, yVar);
                }
                return null;
            }
        }
        c3484u = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3484u(continuation);
        java.lang.Object obj2 = c3484u.j;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3484u.k;
        if (i2 != 0) {
        }
        yVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) objectRef3.element;
        if (yVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object I(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3486w c3486w;
        int i2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3486w) {
            c3486w = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3486w) continuation;
            int i3 = c3486w.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3486w.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c3486w.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3486w.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.List list = (java.util.List) c3486w.f7759a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return list;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3485v c3485v = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3485v(xmlPullParser, null, arrayList);
                c3486w.f7759a = arrayList;
                c3486w.c = 1;
                return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3485v, c3486w) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        c3486w = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3486w(continuation);
        java.lang.Object obj2 = c3486w.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3486w.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object J(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3488y c3488y;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.lang.String str;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3488y) {
            c3488y = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3488y) continuation;
            int i3 = c3488y.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3488y.d = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c3488y.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3488y.d;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3487x c3487x = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3487x(xmlPullParser, null, objectRef3, objectRef4);
                    c3488y.f7761a = objectRef3;
                    c3488y.b = objectRef4;
                    c3488y.d = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3487x, c3488y) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) c3488y.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c3488y.f7761a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) objectRef2.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n((java.lang.String) objectRef.element, str);
                }
                return null;
            }
        }
        c3488y = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3488y(continuation);
        java.lang.Object obj2 = c3488y.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3488y.d;
        if (i2 != 0) {
        }
        str = (java.lang.String) objectRef2.element;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object K(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.A a2;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.A) {
            a2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.A) continuation;
            int i3 = a2.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a2.j = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = a2.i;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = a2.j;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef6 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef7 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef8 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef9 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef10 = new kotlin.jvm.internal.Ref.ObjectRef();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3489z c3489z = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3489z(xmlPullParser, null, objectRef6, objectRef7, objectRef8, objectRef9, objectRef10, arrayList4, arrayList5, arrayList6);
                    a2.f7711a = objectRef6;
                    a2.b = objectRef7;
                    a2.c = objectRef8;
                    a2.d = objectRef9;
                    a2.e = objectRef10;
                    a2.f = arrayList4;
                    a2.g = arrayList5;
                    a2.h = arrayList6;
                    a2.j = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3489z, a2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef6;
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    objectRef2 = objectRef8;
                    objectRef3 = objectRef7;
                    objectRef4 = objectRef9;
                    objectRef5 = objectRef10;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r2 = (java.util.List) a2.h;
                    ?? r3 = (java.util.List) a2.g;
                    ?? r4 = (java.util.List) a2.f;
                    objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) a2.e;
                    objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) a2.d;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) a2.c;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) a2.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) a2.f7711a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrayList3 = r2;
                    arrayList2 = r3;
                    arrayList = r4;
                }
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) objectRef.element, (java.lang.String) objectRef3.element, (java.lang.String) objectRef2.element, (java.lang.String) objectRef4.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s) objectRef5.element, arrayList, arrayList2, arrayList3);
            }
        }
        a2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.A(continuation);
        java.lang.Object obj2 = a2.i;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = a2.j;
        if (i2 != 0) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) objectRef.element, (java.lang.String) objectRef3.element, (java.lang.String) objectRef2.element, (java.lang.String) objectRef4.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s) objectRef5.element, arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object L(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E e2;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef6;
        kotlin.jvm.internal.Ref.ObjectRef objectRef7;
        kotlin.jvm.internal.Ref.ObjectRef objectRef8;
        kotlin.jvm.internal.Ref.ObjectRef objectRef9;
        kotlin.jvm.internal.Ref.ObjectRef objectRef10;
        kotlin.jvm.internal.Ref.ObjectRef objectRef11;
        kotlin.jvm.internal.Ref.ObjectRef objectRef12;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E) {
            e2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E) continuation;
            int i3 = e2.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e2.n = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = e2.m;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = e2.n;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef13 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef14 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef15 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef16 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef17 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef18 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef19 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef20 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef21 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef22 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef23 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef24 = new kotlin.jvm.internal.Ref.ObjectRef();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D d2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D(xmlPullParser, null, objectRef14, objectRef15, objectRef16, objectRef17, objectRef18, objectRef19, objectRef20, objectRef21, objectRef22, objectRef23, objectRef24, objectRef13);
                    e2.f7715a = objectRef13;
                    e2.b = objectRef14;
                    e2.c = objectRef15;
                    e2.d = objectRef16;
                    e2.e = objectRef17;
                    e2.f = objectRef18;
                    e2.g = objectRef19;
                    e2.h = objectRef20;
                    e2.i = objectRef21;
                    e2.j = objectRef22;
                    e2.k = objectRef23;
                    e2.l = objectRef24;
                    e2.n = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(d2, e2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef13;
                    objectRef2 = objectRef24;
                    objectRef3 = objectRef14;
                    objectRef4 = objectRef23;
                    objectRef5 = objectRef17;
                    objectRef6 = objectRef22;
                    objectRef7 = objectRef15;
                    objectRef8 = objectRef21;
                    objectRef9 = objectRef16;
                    objectRef10 = objectRef20;
                    objectRef11 = objectRef18;
                    objectRef12 = objectRef19;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) e2.l;
                    objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) e2.k;
                    objectRef6 = (kotlin.jvm.internal.Ref.ObjectRef) e2.j;
                    objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) e2.i;
                    objectRef10 = (kotlin.jvm.internal.Ref.ObjectRef) e2.h;
                    objectRef12 = (kotlin.jvm.internal.Ref.ObjectRef) e2.g;
                    objectRef11 = (kotlin.jvm.internal.Ref.ObjectRef) e2.f;
                    objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) e2.e;
                    objectRef9 = (kotlin.jvm.internal.Ref.ObjectRef) e2.d;
                    objectRef7 = (kotlin.jvm.internal.Ref.ObjectRef) e2.c;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) e2.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) e2.f7715a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (objectRef.element != 0 || objectRef9.element == 0 || objectRef7.element == 0) {
                    return null;
                }
                T t2 = objectRef.element;
                kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
                java.lang.String str = (java.lang.String) t2;
                java.lang.String str2 = (java.lang.String) objectRef3.element;
                T t3 = objectRef7.element;
                kotlin.jvm.internal.Intrinsics.checkNotNull(t3);
                boolean booleanValue = ((java.lang.Boolean) t3).booleanValue();
                T t4 = objectRef9.element;
                kotlin.jvm.internal.Intrinsics.checkNotNull(t4);
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q(str, str2, booleanValue, (java.lang.String) t4, (java.lang.Integer) objectRef5.element, (java.lang.Integer) objectRef11.element, (java.lang.String) objectRef12.element, (java.lang.Integer) objectRef10.element, (java.lang.Integer) objectRef8.element, (java.lang.Integer) objectRef6.element, (java.lang.Boolean) objectRef4.element, (java.lang.String) objectRef2.element);
            }
        }
        e2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E(continuation);
        java.lang.Object obj2 = e2.m;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = e2.n;
        if (i2 != 0) {
        }
        if (objectRef.element != 0) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object M(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G g2;
        int i2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G) {
            g2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G) continuation;
            int i3 = g2.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g2.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = g2.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = g2.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.List list = (java.util.List) g2.f7717a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return list;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F f2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F(xmlPullParser, null, arrayList);
                g2.f7717a = arrayList;
                g2.c = 1;
                return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(f2, g2) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        g2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G(continuation);
        java.lang.Object obj2 = g2.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = g2.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object N(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I i2;
        int i3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I) {
            i2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I) continuation;
            int i4 = i2.d;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                i2.d = i4 - Integer.MIN_VALUE;
                java.lang.Object obj = i2.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = i2.d;
                if (i3 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H h2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H(xmlPullParser, null, objectRef3, objectRef4);
                    i2.f7719a = objectRef3;
                    i2.b = objectRef4;
                    i2.d = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(h2, i2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i3 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) i2.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) i2.f7719a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (objectRef.element == 0 || objectRef2.element != 0) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s((java.lang.String) objectRef.element, (java.lang.String) objectRef2.element);
                }
                return null;
            }
        }
        i2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I(continuation);
        java.lang.Object obj2 = i2.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = i2.d;
        if (i3 != 0) {
        }
        if (objectRef.element == 0) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s((java.lang.String) objectRef.element, (java.lang.String) objectRef2.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object O(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K k2;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K) {
            k2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K) continuation;
            int i3 = k2.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k2.d = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = k2.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = k2.d;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J j2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.J(xmlPullParser, null, objectRef4, objectRef3);
                    k2.f7721a = objectRef3;
                    k2.b = objectRef4;
                    k2.d = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(j2, k2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) k2.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) k2.f7721a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (objectRef.element == 0 && objectRef2.element != 0) {
                    T t2 = objectRef.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
                    T t3 = objectRef2.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t3);
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t((java.lang.String) t2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) t3);
                }
            }
        }
        k2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K(continuation);
        java.lang.Object obj2 = k2.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = k2.d;
        if (i2 != 0) {
        }
        return objectRef.element == 0 ? null : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object P(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M m2;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M) {
            m2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M) continuation;
            int i3 = m2.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m2.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = m2.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = m2.c;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L l2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L(xmlPullParser, null, objectRef2);
                    m2.f7723a = objectRef2;
                    m2.c = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(l2, m2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) m2.f7723a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return objectRef.element;
            }
        }
        m2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M(continuation);
        java.lang.Object obj2 = m2.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = m2.c;
        if (i2 != 0) {
        }
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object Q(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O o2;
        int i2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O) {
            o2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O) continuation;
            int i3 = o2.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o2.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = o2.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = o2.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.List list = (java.util.List) o2.f7725a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return list;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N n2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N(xmlPullParser, null, arrayList);
                o2.f7725a = arrayList;
                o2.c = 1;
                return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(n2, o2) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        o2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O(continuation);
        java.lang.Object obj2 = o2.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = o2.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object R(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Q q2;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        T t2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Q) {
            q2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Q) continuation;
            int i3 = q2.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q2.e = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = q2.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = q2.e;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef5 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef6 = new kotlin.jvm.internal.Ref.ObjectRef();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P p2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.P(xmlPullParser, null, objectRef4, objectRef6, objectRef5);
                    q2.f7727a = objectRef4;
                    q2.b = objectRef5;
                    q2.c = objectRef6;
                    q2.e = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(p2, q2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef4;
                    objectRef2 = objectRef5;
                    objectRef3 = objectRef6;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) q2.c;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) q2.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) q2.f7727a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                t2 = objectRef.element;
                if (t2 != 0 || objectRef2.element == 0 || (t2 == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.n && objectRef3.element == 0)) {
                    return null;
                }
                T t3 = objectRef.element;
                kotlin.jvm.internal.Intrinsics.checkNotNull(t3);
                T t4 = objectRef2.element;
                kotlin.jvm.internal.Intrinsics.checkNotNull(t4);
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v) t3, (java.lang.String) t4, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r) objectRef3.element);
            }
        }
        q2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Q(continuation);
        java.lang.Object obj2 = q2.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = q2.e;
        if (i2 != 0) {
        }
        t2 = objectRef.element;
        if (t2 != 0) {
        }
        return null;
    }

    public static final java.lang.Object S(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.R(xmlPullParser, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object T(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.T t2;
        int i2;
        java.util.List list;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.T) {
            t2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.T) continuation;
            int i3 = t2.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t2.e = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = t2.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = t2.e;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.S s2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.S(xmlPullParser, null, objectRef3, objectRef4, arrayList);
                    t2.f7730a = arrayList;
                    t2.b = objectRef3;
                    t2.c = objectRef4;
                    t2.e = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(s2, t2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = arrayList;
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) t2.c;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) t2.b;
                    list = (java.util.List) t2.f7730a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (list.isEmpty() || objectRef2.element != 0) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w(list, (java.lang.String) objectRef2.element, (java.lang.String) objectRef.element);
                }
                return null;
            }
        }
        t2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.T(continuation);
        java.lang.Object obj2 = t2.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = t2.e;
        if (i2 != 0) {
        }
        if (list.isEmpty()) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w(list, (java.lang.String) objectRef2.element, (java.lang.String) objectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object U(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.V v2;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.lang.String str;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.V) {
            v2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.V) continuation;
            int i3 = v2.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v2.d = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = v2.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = v2.d;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.U u2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.U(xmlPullParser, null, objectRef3, objectRef4);
                    v2.f7732a = objectRef3;
                    v2.b = objectRef4;
                    v2.d = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(u2, v2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) v2.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) v2.f7732a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) objectRef2.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z((java.lang.String) objectRef.element, str);
                }
                return null;
            }
        }
        v2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.V(continuation);
        java.lang.Object obj2 = v2.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = v2.d;
        if (i2 != 0) {
        }
        str = (java.lang.String) objectRef2.element;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object V(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Z z2;
        int i2;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        java.lang.String str;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Z) {
            z2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Z) continuation;
            int i3 = z2.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z2.h = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = z2.g;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = z2.h;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef5 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef6 = new kotlin.jvm.internal.Ref.ObjectRef();
                    arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Y y2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Y(xmlPullParser, null, objectRef5, objectRef4, objectRef6, arrayList, arrayList4, arrayList5);
                    z2.f7736a = objectRef4;
                    z2.b = objectRef5;
                    z2.c = objectRef6;
                    z2.d = arrayList;
                    z2.e = arrayList4;
                    z2.f = arrayList5;
                    z2.h = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(y2, z2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef4;
                    objectRef2 = objectRef5;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                    objectRef3 = objectRef6;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r2 = (java.util.List) z2.f;
                    ?? r3 = (java.util.List) z2.e;
                    ?? r4 = (java.util.List) z2.d;
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) z2.c;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) z2.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) z2.f7736a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrayList3 = r2;
                    arrayList2 = r3;
                    arrayList = r4;
                }
                str = (java.lang.String) objectRef.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B(str, (java.lang.Boolean) objectRef2.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) objectRef3.element, arrayList, arrayList2, arrayList3);
                }
                return null;
            }
        }
        z2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Z(continuation);
        java.lang.Object obj2 = z2.g;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = z2.h;
        if (i2 != 0) {
        }
        str = (java.lang.String) objectRef.element;
        if (str == null) {
        }
    }

    public static /* synthetic */ void d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object y(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3467c c3467c;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.lang.String str;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3467c) {
            c3467c = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3467c) continuation;
            int i3 = c3467c.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3467c.d = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c3467c.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3467c.d;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3466b c3466b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3466b(xmlPullParser, null, objectRef4, objectRef3);
                    c3467c.f7739a = objectRef3;
                    c3467c.b = objectRef4;
                    c3467c.d = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3466b, c3467c) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) c3467c.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c3467c.f7739a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) objectRef.element;
                if (str == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c(str, (java.lang.Boolean) objectRef2.element);
                }
                return null;
            }
        }
        c3467c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3467c(continuation);
        java.lang.Object obj2 = c3467c.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3467c.d;
        if (i2 != 0) {
        }
        str = (java.lang.String) objectRef.element;
        if (str == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object z(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3469e c3469e;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3469e) {
            c3469e = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3469e) continuation;
            int i3 = c3469e.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3469e.d = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c3469e.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3469e.d;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3468d c3468d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3468d(xmlPullParser, null, objectRef4, objectRef3);
                    c3469e.f7741a = objectRef3;
                    c3469e.b = objectRef4;
                    c3469e.d = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3468d, c3469e) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) c3469e.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c3469e.f7741a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (objectRef.element == 0 || objectRef2.element != 0) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d((java.lang.String) objectRef.element, (java.lang.String) objectRef2.element);
                }
                return null;
            }
        }
        c3469e = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3469e(continuation);
        java.lang.Object obj2 = c3469e.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3469e.d;
        if (i2 != 0) {
        }
        if (objectRef.element == 0) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d((java.lang.String) objectRef.element, (java.lang.String) objectRef2.element);
    }

    public static final boolean h(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1;
    }

    public static final boolean i(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static final boolean j(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 0;
    }

    public static final boolean k(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static final boolean l(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 4;
    }

    public static final java.lang.Integer m(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String b2 = b(xmlPullParser, "sequence");
        if (b2 == null) {
            return null;
        }
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(b2);
        return java.lang.Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 999);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r n(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String b2 = b(xmlPullParser, "skipoffset");
        if (b2 != null) {
            return g(b2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object e(org.xmlpull.v1.XmlPullParser xmlPullParser, boolean z2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3476m c3476m;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h hVar;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3476m) {
            c3476m = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3476m) continuation;
            int i3 = c3476m.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3476m.g = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c3476m.f;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3476m.g;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef6 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef7 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef8 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef9 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef10 = new kotlin.jvm.internal.Ref.ObjectRef();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3475l c3475l = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3475l(xmlPullParser, null, objectRef6, objectRef7, objectRef8, objectRef9, objectRef10, z2);
                    c3476m.f7749a = objectRef6;
                    c3476m.b = objectRef7;
                    c3476m.c = objectRef8;
                    c3476m.d = objectRef9;
                    c3476m.e = objectRef10;
                    c3476m.g = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3475l, c3476m) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef6;
                    objectRef2 = objectRef7;
                    objectRef3 = objectRef10;
                    objectRef4 = objectRef8;
                    objectRef5 = objectRef9;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) c3476m.e;
                    objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) c3476m.d;
                    objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) c3476m.c;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) c3476m.b;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) c3476m.f7749a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h) objectRef3.element;
                if (hVar == null) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g((java.lang.String) objectRef.element, (java.lang.Integer) objectRef2.element, (java.lang.String) objectRef4.element, (java.lang.String) objectRef5.element, hVar);
                }
                return null;
            }
        }
        c3476m = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3476m(continuation);
        java.lang.Object obj2 = c3476m.f;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3476m.g;
        if (i2 != 0) {
        }
        hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h) objectRef3.element;
        if (hVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object f(org.xmlpull.v1.XmlPullParser xmlPullParser, boolean z2, kotlin.coroutines.Continuation<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3478o c3478o;
        int i2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3478o) {
            c3478o = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3478o) continuation;
            int i3 = c3478o.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3478o.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c3478o.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c3478o.c;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.List list = (java.util.List) c3478o.f7751a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return list;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3477n c3477n = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3477n(xmlPullParser, null, z2, arrayList);
                c3478o.f7751a = arrayList;
                c3478o.c = 1;
                return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3477n, c3478o) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        c3478o = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3478o(continuation);
        java.lang.Object obj2 = c3478o.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c3478o.c;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object g(org.xmlpull.v1.XmlPullParser xmlPullParser, boolean z2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C c2;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        java.util.ArrayList arrayList;
        boolean z3;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C) {
            c2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C) continuation;
            int i3 = c2.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2.j = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c2.i;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2.j;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef5 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef6 = new kotlin.jvm.internal.Ref.ObjectRef();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    kotlin.jvm.internal.Ref.ObjectRef objectRef7 = new kotlin.jvm.internal.Ref.ObjectRef();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B b2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B(xmlPullParser, null, objectRef5, objectRef, objectRef6, arrayList4, arrayList5, objectRef7, z2, arrayList6);
                    c2.b = objectRef5;
                    c2.c = objectRef;
                    c2.d = objectRef6;
                    c2.e = arrayList4;
                    c2.f = arrayList5;
                    c2.g = objectRef7;
                    c2.h = arrayList6;
                    c2.f7713a = z2;
                    c2.j = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(b2, c2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef5;
                    objectRef3 = objectRef6;
                    arrayList = arrayList6;
                    z3 = z2;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList4;
                    objectRef4 = objectRef7;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z3 = c2.f7713a;
                    ?? r3 = (java.util.List) c2.h;
                    objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) c2.g;
                    ?? r5 = (java.util.List) c2.f;
                    ?? r6 = (java.util.List) c2.e;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) c2.d;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef9 = (kotlin.jvm.internal.Ref.ObjectRef) c2.c;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) c2.b;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrayList = r3;
                    objectRef3 = objectRef8;
                    objectRef = objectRef9;
                    arrayList2 = r5;
                    arrayList3 = r6;
                }
                if (z3 || !arrayList3.isEmpty()) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r) objectRef2.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) objectRef.element, (java.lang.Long) objectRef3.element, arrayList3, arrayList2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A) objectRef4.element, arrayList);
                }
                return null;
            }
        }
        c2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C(continuation);
        java.lang.Object obj2 = c2.i;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2.j;
        if (i2 != 0) {
        }
        if (z3) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r) objectRef2.element, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) objectRef.element, (java.lang.Long) objectRef3.element, arrayList3, arrayList2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A) objectRef4.element, arrayList);
    }

    public static final java.lang.Integer h(java.lang.String str) {
        java.lang.Object m10798constructorimpl;
        java.lang.Integer num;
        int intValue;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Number parse = b.parse(str);
            if (parse == null || (intValue = (num = java.lang.Integer.valueOf((int) (parse.floatValue() * 100))).intValue()) < 0 || intValue >= 101) {
                num = null;
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(num);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return (java.lang.Integer) (kotlin.Result.m10804isFailureimpl(m10798constructorimpl) ? null : m10798constructorimpl);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v i(java.lang.String str) {
        switch (str.hashCode()) {
            case -1638835128:
                if (str.equals("midpoint")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.d;
                }
                return null;
            case -1337830390:
                if (str.equals("thirdQuartile")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.e;
                }
                return null;
            case -1001078227:
                if (str.equals(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.n;
                }
                return null;
            case -934426579:
                if (str.equals("resume")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.k;
                }
                return null;
            case -934318917:
                if (str.equals("rewind")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.j;
                }
                return null;
            case -840405966:
                if (str.equals("unmute")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.h;
                }
                return null;
            case -599445191:
                if (str.equals("complete")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f;
                }
                return null;
            case -37683395:
                if (str.equals("closeLinear")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.l;
                }
                return null;
            case 3363353:
                if (str.equals("mute")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.g;
                }
                return null;
            case 3532159:
                if (str.equals("skip")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.m;
                }
                return null;
            case 106440182:
                if (str.equals("pause")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.i;
                }
                return null;
            case 109757538:
                if (str.equals("start")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.b;
                }
                return null;
            case 560220243:
                if (str.equals("firstQuartile")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.c;
                }
                return null;
            case 1778167540:
                if (str.equals("creativeView")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f7788a;
                }
                return null;
            default:
                return null;
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i b() {
        return c();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j c() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j) f7710a.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j a() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j();
    }

    public static final java.lang.String b(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null || !(!kotlin.text.StringsKt.isBlank(attributeValue))) {
            return null;
        }
        return attributeValue;
    }

    public static final java.lang.Object a(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.jvm.functions.Function2<? super org.xmlpull.v1.XmlPullParser, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function3<? super org.xmlpull.v1.XmlPullParser, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function2<? super org.xmlpull.v1.XmlPullParser, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3465a c3465a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C3465a(xmlPullParser, function2, function3, function22, null);
        kotlin.jvm.internal.InlineMarker.mark(0);
        kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c3465a, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object h(org.xmlpull.v1.XmlPullParser xmlPullParser, boolean z2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.X x2;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.util.List list;
        java.util.List list2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.X) {
            x2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.X) continuation;
            int i3 = x2.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x2.f = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = x2.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = x2.f;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.W w2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.W(xmlPullParser, null, objectRef2, arrayList, arrayList2);
                    x2.b = objectRef2;
                    x2.c = arrayList;
                    x2.d = arrayList2;
                    x2.f7734a = z2;
                    x2.f = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(w2, x2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                    list = arrayList;
                    list2 = arrayList2;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = x2.f7734a;
                    list2 = (java.util.List) x2.d;
                    list = (java.util.List) x2.c;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) x2.b;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (z2 || objectRef.element != 0) {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z) objectRef.element, list, list2);
                }
                return null;
            }
        }
        x2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.X(continuation);
        java.lang.Object obj2 = x2.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = x2.f;
        if (i2 != 0) {
        }
        if (z2) {
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z) objectRef.element, list, list2);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r g(java.lang.String str) {
        java.lang.Long f2 = f(str);
        if (f2 != null) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b(f2.longValue());
        }
        java.lang.Integer h2 = h(str);
        if (h2 != null) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a(h2.intValue());
        }
        return null;
    }

    public static final java.text.SimpleDateFormat e() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K.a("HH:mm:ss.SSS");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i e(java.lang.String str) {
        if (kotlin.text.StringsKt.startsWith(str, "image/", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.f7775a;
        }
        if (kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) "javascript", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.b;
        }
        return null;
    }

    public static final java.lang.Long f(java.lang.String str) {
        java.lang.Object m10798constructorimpl;
        java.lang.Object m10798constructorimpl2;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.util.Date parse = e().parse(str);
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(parse != null ? java.lang.Long.valueOf(parse.getTime()) : null);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = null;
        }
        java.lang.Long l2 = (java.lang.Long) m10798constructorimpl;
        if (l2 != null) {
            return l2;
        }
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            java.util.Date parse2 = f().parse(str);
            m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(parse2 != null ? java.lang.Long.valueOf(parse2.getTime()) : null);
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        return (java.lang.Long) (kotlin.Result.m10804isFailureimpl(m10798constructorimpl2) ? null : m10798constructorimpl2);
    }

    public static final java.text.SimpleDateFormat f() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K.a("HH:mm:ss");
    }
}
