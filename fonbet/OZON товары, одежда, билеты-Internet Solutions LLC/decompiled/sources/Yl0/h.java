package Yl0;

import Sc.s;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.protobuf.DescriptorProtos$FileOptions;
import ib.C7038a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.RegisterPushClickActivityCallbackUseCase$onActivityCreated$1", f = "RegisterPushClickActivityCallbackUseCase.kt", l = {33, DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 40}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public Object f35161d;

    /* renamed from: e, reason: collision with root package name */
    public String f35162e;

    /* renamed from: f, reason: collision with root package name */
    public int f35163f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Activity f35164g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f35165h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Activity activity, i iVar, kotlin.coroutines.d<? super h> dVar) {
        super(2, dVar);
        this.f35164g = activity;
        this.f35165h = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f35164g, this.f35165h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return new h(this.f35164g, this.f35165h, dVar).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r10 == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00be  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bundle extras;
        String str;
        Bundle bundle;
        String str2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f35163f;
        i iVar = this.f35165h;
        if (i11 == 0) {
            s.b(obj);
            Intent intent = this.f35164g.getIntent();
            if (intent != null && (extras = intent.getExtras()) != null) {
                String action = intent.getAction();
                if (action == null) {
                    action = "";
                }
                this.f35161d = extras;
                this.f35162e = action;
                this.f35163f = 1;
                C10720e0 c10720e0 = C10720e0.f105451a;
                Object f7 = C10727i.f(De.s.f6650a, new Jl0.b(extras, null), this);
                if (f7 != aVar) {
                    str = action;
                    obj = f7;
                    bundle = extras;
                }
                return aVar;
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.f35161d;
                s.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    iVar.f35168c.a(C7038a.C1088a.a(str2));
                    return Unit.f71690a;
                }
                iVar.f35170e.info("clickSDKNotificationEvent skipped");
                return Unit.f71690a;
            }
            str = (String) this.f35161d;
            s.b(obj);
            Integer num = (Integer) obj;
            if (num != null) {
                Nl0.k kVar = iVar.f35167b;
                int intValue = num.intValue();
                this.f35161d = str;
                this.f35163f = 3;
                Ol0.s sVar = kVar.f19640a;
                obj = Eb.g.a(sVar.f20522a, sVar.f20523b, new Integer(intValue), new Integer(0), this);
                if (obj != aVar) {
                    str2 = str;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return aVar;
            }
            iVar.f35170e.info("clickSDKNotificationEvent skipped");
            return Unit.f71690a;
        }
        str = this.f35162e;
        bundle = (Bundle) this.f35161d;
        s.b(obj);
        if (!((Boolean) obj).booleanValue()) {
            return Unit.f71690a;
        }
        this.f35161d = str;
        this.f35162e = null;
        this.f35163f = 2;
        C10720e0 c10720e02 = C10720e0.f105451a;
        obj = C10727i.f(De.s.f6650a, new Jl0.a(bundle, null), this);
    }
}
