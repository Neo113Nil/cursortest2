package w0;

import D6.C;
import a.AbstractC0603a;
import android.net.Uri;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f17265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f17266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Uri uri, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f17265b = dVar;
        this.f17266c = uri;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new c(this.f17265b, this.f17266c, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f17264a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            y0.b bVar = this.f17265b.f17267a;
            this.f17264a = 1;
            if (bVar.d(this.f17266c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
        }
        return C1116i.f13008a;
    }
}
