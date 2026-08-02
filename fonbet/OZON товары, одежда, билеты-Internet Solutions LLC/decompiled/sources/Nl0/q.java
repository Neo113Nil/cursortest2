package Nl0;

import Sc.r;
import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import fm0.InterfaceC6586g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.repository.VkpnsTopicRepository$unsubscribeFromTopic$2", f = "VkpnsTopicRepository.kt", l = {33, DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class q extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Sc.r<? extends Unit>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f19651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f19652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f19653f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, String str, kotlin.coroutines.d<? super q> dVar) {
        super(2, dVar);
        this.f19652e = rVar;
        this.f19653f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new q(this.f19652e, this.f19653f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Sc.r<? extends Unit>> dVar) {
        return new q(this.f19652e, this.f19653f, dVar).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f19651d;
        r rVar = this.f19652e;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC6586g interfaceC6586g = rVar.f19655b;
            this.f19651d = 1;
            obj = interfaceC6586g.a(this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                a11 = ((Sc.r) obj).getF26106a();
                return Sc.r.a(a11);
            }
            s.b(obj);
        }
        String str = (String) obj;
        if (str != null) {
            Za.d dVar = rVar.f19657d;
            StringBuilder sb2 = new StringBuilder("Start unsubscribe from topic ");
            String str2 = this.f19653f;
            sb2.append(str2);
            dVar.info(sb2.toString());
            this.f19651d = 2;
            a11 = rVar.f19654a.a(str, str2, this);
        } else {
            rVar.f19657d.b("Unable to unsubscribe from topic, token is not exists. You need to get Push Token before use unsubscribeFromTopic", null);
            r.Companion companion = Sc.r.INSTANCE;
            a11 = s.a(new Exception("Unable to unsubscribe from topic, token is not exists. You need to get Push Token before use unsubscribeFromTopic"));
        }
        return Sc.r.a(a11);
    }
}
