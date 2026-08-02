package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.datatransport.TransportRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import live.football.scorerepublic.MainActivity;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd0 implements InterfaceC0254gm, nw0, r60, iu0, InterfaceC0554or, s30, e41, nb1, InterfaceC0436lk {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1629j;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1158c() {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1159d(int i, int i2) {
        throw new IndexOutOfBoundsException("Index:" + i + ((Object) ", Size:") + i2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m1160e(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m1161f(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m1162g(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m1163h(Throwable th) {
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m1164i() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m1165k(Object obj, Object obj2, String str) {
        throw new C0694sj(str + obj + obj2, 2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m1166l(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m1167m(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m1168n(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    @Override // p000.InterfaceC0254gm
    public void accept(Object obj) {
        switch (this.f1629j) {
            case 0:
                n80.m3498g("Impression store read fail: " + ((Throwable) obj).getMessage());
                break;
            case 1:
            default:
                n80.m3498g("Impressions store read fail: " + ((Throwable) obj).getMessage());
                break;
            case 2:
                n80.m3496e("Fetched from cache");
                break;
            case 3:
                n80.m3498g("Cache read error: " + ((Throwable) obj).getMessage());
                break;
        }
    }

    @Override // p000.r60
    public Object apply(Object obj) {
        switch (this.f1629j) {
            case 4:
                C0948ze c0948ze = (C0948ze) obj;
                int iM292o = AbstractC0024an.m292o(c0948ze.m5880n().m454r());
                if (iM292o == 0 || iM292o == 1 || iM292o == 2 || iM292o == 3) {
                    return hm0.m2292a(c0948ze);
                }
                n80.m3496e("Filtering non-displayable message");
                return lm0.f4838j;
            case 14:
                ip0 ip0Var = (ip0) obj;
                ip0Var.getClass();
                oq0 oq0Var = ux0.f7921a;
                oq0Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    oq0Var.m3732b(ip0Var, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 21:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        qd0 qd0VarM4283a = C0648ra.m4283a();
                        qd0VarM4283a.m4087y(cursorRawQuery.getString(1));
                        qd0VarM4283a.f6473m = gx0.m2163b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        qd0VarM4283a.f6472l = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(qd0VarM4283a.m4073e());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            default:
                return (byte[]) obj;
        }
    }

    @Override // p000.nb1
    public Object get() {
        throw new IllegalStateException();
    }

    @Override // p000.iu0
    /* JADX INFO: renamed from: j */
    public void mo86j(v92 v92Var) {
        String str = MainActivity.f4805L;
        v92Var.getClass();
        if (v92Var.m5133i()) {
            Log.d("MainActivity", "Token: " + ((String) v92Var.m5131g()));
        }
    }

    @Override // p000.nw0
    public boolean test(Object obj) {
        return !((Boolean) obj).booleanValue();
    }

    @Override // p000.InterfaceC0436lk
    /* JADX INFO: renamed from: x */
    public Object mo532x(C0902y5 c0902y5) {
        return TransportRegistrar.lambda$getComponents$0(c0902y5);
    }

    public /* synthetic */ dd0(int i) {
        this.f1629j = i;
    }

    @Override // p000.InterfaceC0554or
    /* JADX INFO: renamed from: a */
    public void mo1169a(my0 my0Var) {
    }

    @Override // p000.s30
    /* JADX INFO: renamed from: b */
    public void mo1170b(n20 n20Var) {
    }
}
