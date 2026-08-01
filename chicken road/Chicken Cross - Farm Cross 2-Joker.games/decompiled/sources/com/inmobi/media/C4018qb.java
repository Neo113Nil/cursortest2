package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.qb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4018qb extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4130ub f7324a;
    public final /* synthetic */ EnumC3663dp b;
    public final /* synthetic */ JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4018qb(C4130ub c4130ub, EnumC3663dp enumC3663dp, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.f7324a = c4130ub;
        this.b = enumC3663dp;
        this.c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4018qb(this.f7324a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4018qb) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Ej ej = this.f7324a.f7412a;
        EnumC3663dp action = this.b;
        JSONObject jSONObject = this.c;
        ej.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        C3591b9 c3591b9 = ej.a1;
        if (c3591b9 != null) {
            Intrinsics.checkNotNullParameter(action, "action");
            boolean z = false;
            switch (action.ordinal()) {
                case 0:
                    z = c3591b9.b(true);
                    if (z) {
                        ej.a(V8.l, jSONObject);
                        break;
                    }
                    break;
                case 1:
                    z = c3591b9.b(false);
                    if (z) {
                    }
                    break;
                case 2:
                    Y8[] y8Arr = {Y8.c, Y8.f, Y8.g};
                    G8[] g8Arr = G8.f6577a;
                    if (c3591b9.a(y8Arr, "executeVideoPlayerActions", "play", Y8.e)) {
                        c3591b9.j.e();
                        z = true;
                    }
                    if (z) {
                    }
                    break;
                case 3:
                    Y8[] y8Arr2 = {Y8.c, Y8.g, Y8.e};
                    G8[] g8Arr2 = G8.f6577a;
                    if (c3591b9.a(y8Arr2, "executeVideoPlayerActions", CampaignEx.JSON_NATIVE_VIDEO_PAUSE, Y8.f)) {
                        c3591b9.j.d();
                        z = true;
                    }
                    if (z) {
                    }
                    break;
                case 4:
                    z = c3591b9.a(true);
                    if (z) {
                    }
                    break;
                case 5:
                    z = c3591b9.a(false);
                    if (z) {
                    }
                    break;
                case 6:
                    Y8[] y8Arr3 = {Y8.c, Y8.g, Y8.e};
                    G8[] g8Arr3 = G8.f6577a;
                    if (c3591b9.a(y8Arr3, "executeVideoPlayerActions", CampaignEx.JSON_NATIVE_VIDEO_PAUSE, Y8.f)) {
                        c3591b9.j.d();
                        z = true;
                    }
                    Ag ag = c3591b9.o;
                    if (ag != null) {
                        C4226xp videoEvent = new C4226xp((long) c3591b9.j.b().getTime());
                        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
                        Bf bf = ag.e;
                        if (bf != null) {
                            bf.a(videoEvent);
                        }
                    }
                    if (z) {
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            G8[] g8Arr4 = G8.f6577a;
            B8 obj2 = new B8(jSONObject);
            Intrinsics.checkNotNullParameter(obj2, "obj");
            JSONObject a2 = AbstractC3875lb.a(obj2, B8.class);
            if (a2 == null) {
                a2 = new JSONObject();
            }
            V8 v8 = V8.b;
            ej.a("VideoCommandError", a2);
        }
        return Unit.INSTANCE;
    }
}
