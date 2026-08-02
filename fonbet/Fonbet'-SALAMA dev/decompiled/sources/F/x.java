package F;

import A1.L0;
import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import i4.C1265b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.HashMap;
import javax.crypto.AEADBadTagException;
import n3.AbstractC1464a;
import w1.F0;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public Object f2475a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2476b;

    public x(A5.h hVar, String str) {
        this.f2475a = hVar;
        this.f2476b = str;
    }

    public static byte[] m(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i7 = remaining % 16;
        int i8 = (i7 == 0 ? remaining : (remaining + 16) - i7) + length;
        ByteBuffer order = ByteBuffer.allocate(i8 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i8);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    public abstract void e(F0 f02);

    public void f() {
        L0 l02 = (L0) this.f2475a;
        if (l02 != null) {
            try {
                ((i.v) this.f2476b).f13749B.unregisterReceiver(l02);
            } catch (IllegalArgumentException unused) {
            }
            this.f2475a = null;
        }
    }

    public abstract IntentFilter g();

    public byte[] h(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((L3.e) this.f2476b).a(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(AbstractC1464a.j(bArr4, m(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            L3.e eVar = (L3.e) this.f2475a;
            eVar.getClass();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            eVar.k(bArr, allocate, byteBuffer);
            return allocate.array();
        } catch (GeneralSecurityException e7) {
            throw new AEADBadTagException(e7.toString());
        }
    }

    public void i(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        L3.e eVar = (L3.e) this.f2475a;
        eVar.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        eVar.k(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        ((L3.e) this.f2476b).a(0, bArr).get(bArr4);
        byte[] j = AbstractC1464a.j(bArr4, m(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(j);
    }

    public abstract int j();

    public String k() {
        return null;
    }

    public MenuItem l(MenuItem menuItem) {
        if (!(menuItem instanceof K.a)) {
            return menuItem;
        }
        K.a aVar = (K.a) menuItem;
        if (((r.l) this.f2476b) == null) {
            this.f2476b = new r.l();
        }
        MenuItem menuItem2 = (MenuItem) ((r.l) this.f2476b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        m.r rVar = new m.r((Context) this.f2475a, aVar);
        ((r.l) this.f2476b).put(aVar, rVar);
        return rVar;
    }

    public abstract L3.e n(int i7, byte[] bArr);

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public void s(String str, C1265b c1265b, String str2) {
        if (((String) this.f2476b).equals(str)) {
            u1.c cVar = new u1.c(c1265b);
            HashMap m7 = e1.k.m("eventType", str);
            if (str2 != null) {
                m7.put("previousChildKey", str2);
            }
            HashMap hashMap = (HashMap) cVar.f16591b;
            HashMap hashMap2 = new HashMap();
            cVar.f16591b = hashMap2;
            hashMap2.putAll(hashMap);
            ((HashMap) cVar.f16591b).putAll(m7);
            ((A5.h) this.f2475a).c((HashMap) cVar.f16591b);
        }
    }

    public void t() {
        f();
        IntentFilter g3 = g();
        if (g3.countActions() == 0) {
            return;
        }
        if (((L0) this.f2475a) == null) {
            this.f2475a = new L0(this, 4);
        }
        ((i.v) this.f2476b).f13749B.registerReceiver((L0) this.f2475a, g3);
    }

    public x(Context context) {
        this.f2475a = context;
    }

    public x() {
        this.f2475a = new android.support.v4.media.b(this);
    }

    public x(i.v vVar) {
        this.f2476b = vVar;
    }
}
