package H3;

import Q2.InterfaceC0362h0;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonWriter;

/* loaded from: classes.dex */
public final class g implements q, U2.f, X1.c, v1.n {

    /* renamed from: m, reason: collision with root package name */
    public static g f2320m;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2321k;

    /* renamed from: l, reason: collision with root package name */
    public String f2322l;

    public /* synthetic */ g() {
        this.f2321k = 2;
    }

    @Override // v1.n
    public boolean b(CharSequence charSequence, int i, int i5, v1.v vVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i5), this.f2322l)) {
            return true;
        }
        vVar.f20383c = (vVar.f20383c & 3) | 4;
        return false;
    }

    @Override // X1.c
    public String d() {
        return this.f2322l;
    }

    @Override // U2.f
    public void e(JsonWriter jsonWriter) {
        Object obj = U2.g.f5868b;
        jsonWriter.name("params").beginObject();
        String str = this.f2322l;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    @Override // H3.q
    public Object k() {
        throw new F3.p(this.f2322l);
    }

    public String toString() {
        switch (this.f2321k) {
            case 1:
                return this.f2322l;
            case 5:
                return L1.a.p(new StringBuilder("<"), this.f2322l, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g(String str, int i) {
        this.f2321k = i;
        this.f2322l = str;
    }

    public g(InterfaceC0362h0 interfaceC0362h0) {
        String str;
        this.f2321k = 1;
        try {
            str = interfaceC0362h0.b();
        } catch (RemoteException e3) {
            U2.j.g("", e3);
            str = null;
        }
        this.f2322l = str;
    }

    @Override // v1.n
    public Object a() {
        return this;
    }

    @Override // X1.c
    public void f(Y1.b bVar) {
    }
}
