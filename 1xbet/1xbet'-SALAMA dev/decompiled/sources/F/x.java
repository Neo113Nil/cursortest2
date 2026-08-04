package F;

import A1.L0;
import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.HashMap;
import javax.crypto.AEADBadTagException;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2476b;

    public x(A5.h hVar, String str) {
        this.f2475a = hVar;
        this.f2476b = str;
    }

    public static byte[] m(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i7 = iRemaining % 16;
        int i8 = (i7 == 0 ? iRemaining : (iRemaining + 16) - i7) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i8 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i8);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public abstract void e(F0 f7);

    public void f() {
        L0 l7 = (L0) this.f2475a;
        if (l7 != null) {
            try {
                ((p058i.v) this.f2476b).f13755B.unregisterReceiver(l7);
            } catch (IllegalArgumentException unused) {
            }
            this.f2475a = null;
        }
    }

    public abstract IntentFilter g();

    public byte[] h(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((L3.e) this.f2476b).a(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(p097n3.a.j(bArr4, m(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            L3.e eVar = (L3.e) this.f2475a;
            eVar.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            eVar.k(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e7) {
            throw new AEADBadTagException(e7.toString());
        }
    }

    public void i(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        L3.e eVar = (L3.e) this.f2475a;
        eVar.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        eVar.k(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        ((L3.e) this.f2476b).a(0, bArr).get(bArr4);
        byte[] bArrJ = p097n3.a.j(bArr4, m(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrJ);
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
        if (((p122r.l) this.f2476b) == null) {
            this.f2476b = new p122r.l();
        }
        MenuItem menuItem2 = (MenuItem) ((p122r.l) this.f2476b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        p086m.r rVar = new p086m.r((Context) this.f2475a, aVar);
        ((p122r.l) this.f2476b).put(aVar, rVar);
        return rVar;
    }

    public abstract L3.e n(int i7, byte[] bArr);

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public void s(String str, p063i4.b bVar, String str2) {
        if (((String) this.f2476b).equals(str)) {
            p145u1.c cVar = new p145u1.c(bVar);
            HashMap mapM = p031e1.k.m("eventType", str);
            if (str2 != null) {
                mapM.put("previousChildKey", str2);
            }
            HashMap map = (HashMap) cVar.f16597b;
            HashMap map2 = new HashMap();
            cVar.f16597b = map2;
            map2.putAll(map);
            ((HashMap) cVar.f16597b).putAll(mapM);
            ((A5.h) this.f2475a).c((HashMap) cVar.f16597b);
        }
    }

    public void t() {
        f();
        IntentFilter intentFilterG = g();
        if (intentFilterG.countActions() == 0) {
            return;
        }
        if (((L0) this.f2475a) == null) {
            this.f2475a = new L0(this, 4);
        }
        ((p058i.v) this.f2476b).f13755B.registerReceiver((L0) this.f2475a, intentFilterG);
    }

    public x(Context context) {
        this.f2475a = context;
    }

    public x() {
        this.f2475a = new android.support.v4.media.b(this);
    }

    public x(p058i.v vVar) {
        this.f2476b = vVar;
    }
}
