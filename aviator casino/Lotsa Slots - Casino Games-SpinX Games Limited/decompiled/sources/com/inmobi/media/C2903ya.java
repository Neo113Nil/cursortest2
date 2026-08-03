package com.inmobi.media;

/* renamed from: com.inmobi.media.ya, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2903ya extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ca f5567a;
    public final /* synthetic */ com.inmobi.media.EnumC2443gn b;
    public final /* synthetic */ org.json.JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2903ya(com.inmobi.media.Ca ca, com.inmobi.media.EnumC2443gn enumC2443gn, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5567a = ca;
        this.b = enumC2443gn;
        this.c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2903ya(this.f5567a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2903ya) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f5567a.f4638a;
        com.inmobi.media.EnumC2443gn action = this.b;
        org.json.JSONObject jSONObject = this.c;
        gestureDetectorOnGestureListenerC2675pi.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        com.inmobi.media.C2926z8 c2926z8 = gestureDetectorOnGestureListenerC2675pi.Z0;
        if (c2926z8 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
            switch (action.ordinal()) {
                case 0:
                    c2926z8.b(true);
                    break;
                case 1:
                    c2926z8.b(false);
                    break;
                case 2:
                    if (!c2926z8.g.get()) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("action", "play");
                        com.inmobi.media.EnumC2850w8 enumC2850w8 = com.inmobi.media.EnumC2850w8.e;
                        com.inmobi.media.EnumC2850w8[] enumC2850w8Arr = {com.inmobi.media.EnumC2850w8.c, com.inmobi.media.EnumC2850w8.f, com.inmobi.media.EnumC2850w8.g, enumC2850w8};
                        com.inmobi.media.EnumC2374e8[] enumC2374e8Arr = com.inmobi.media.EnumC2374e8.f5173a;
                        if (c2926z8.a(enumC2850w8Arr, "executeVideoPlayerActions", jSONObject2.toString(), enumC2850w8)) {
                            c2926z8.k.d();
                            break;
                        }
                    }
                    break;
                case 3:
                    if (!c2926z8.g.get()) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("action", "pause");
                        com.inmobi.media.EnumC2850w8 enumC2850w82 = com.inmobi.media.EnumC2850w8.f;
                        com.inmobi.media.EnumC2850w8[] enumC2850w8Arr2 = {com.inmobi.media.EnumC2850w8.c, enumC2850w82, com.inmobi.media.EnumC2850w8.g, com.inmobi.media.EnumC2850w8.e};
                        com.inmobi.media.EnumC2374e8[] enumC2374e8Arr2 = com.inmobi.media.EnumC2374e8.f5173a;
                        if (c2926z8.a(enumC2850w8Arr2, "executeVideoPlayerActions", jSONObject3.toString(), enumC2850w82)) {
                            c2926z8.k.c();
                            break;
                        }
                    }
                    break;
                case 4:
                    c2926z8.a(true);
                    break;
                case 5:
                    c2926z8.a(false);
                    break;
                case 6:
                    if (!c2926z8.g.get()) {
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        jSONObject4.put("action", "pause");
                        com.inmobi.media.EnumC2850w8 enumC2850w83 = com.inmobi.media.EnumC2850w8.f;
                        com.inmobi.media.EnumC2850w8[] enumC2850w8Arr3 = {com.inmobi.media.EnumC2850w8.c, enumC2850w83, com.inmobi.media.EnumC2850w8.g, com.inmobi.media.EnumC2850w8.e};
                        com.inmobi.media.EnumC2374e8[] enumC2374e8Arr3 = com.inmobi.media.EnumC2374e8.f5173a;
                        if (c2926z8.a(enumC2850w8Arr3, "executeVideoPlayerActions", jSONObject4.toString(), enumC2850w83)) {
                            c2926z8.k.c();
                        }
                    }
                    com.inmobi.media.Gf gf = c2926z8.p;
                    if (gf != null) {
                        com.inmobi.media.An videoEvent = new com.inmobi.media.An((long) c2926z8.k.a().getTime());
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
                        com.inmobi.media.Ie ie = gf.e;
                        if (ie != null) {
                            ie.a(videoEvent);
                            break;
                        }
                    }
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
            gestureDetectorOnGestureListenerC2675pi.a(com.inmobi.media.EnumC2771t8.l, jSONObject);
        } else {
            com.inmobi.media.EnumC2771t8 enumC2771t8 = com.inmobi.media.EnumC2771t8.e;
            com.inmobi.media.EnumC2374e8[] enumC2374e8Arr4 = com.inmobi.media.EnumC2374e8.f5173a;
            com.inmobi.media.C2295b8 obj2 = new com.inmobi.media.C2295b8(jSONObject);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "obj");
            gestureDetectorOnGestureListenerC2675pi.a(enumC2771t8, com.inmobi.media.AbstractC2773ta.a(obj2, com.inmobi.media.C2295b8.class));
        }
        return kotlin.Unit.INSTANCE;
    }
}
