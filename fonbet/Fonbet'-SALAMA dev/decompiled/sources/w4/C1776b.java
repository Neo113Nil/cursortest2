package w4;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;

/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1776b implements InterfaceC1775a {

    /* renamed from: b, reason: collision with root package name */
    public static final L3.b f18046b = new L3.b(8);

    /* renamed from: a, reason: collision with root package name */
    public StringBuilder f18047a;

    static {
        new L3.b(9);
    }

    @Override // w4.InterfaceC1775a
    public final boolean a(byte[] bArr) {
        String str;
        try {
            str = ((CharsetDecoder) f18046b.get()).decode(ByteBuffer.wrap(bArr)).toString();
        } catch (CharacterCodingException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        this.f18047a.append(str);
        return true;
    }

    @Override // w4.InterfaceC1775a
    public final J2.e b() {
        String sb = this.f18047a.toString();
        J2.e eVar = new J2.e();
        eVar.f3813a = sb;
        return eVar;
    }
}
