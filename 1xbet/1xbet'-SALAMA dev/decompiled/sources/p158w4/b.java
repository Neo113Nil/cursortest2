package p158w4;

import J2.e;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L3.b f18052b = new L3.b(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StringBuilder f18053a;

    static {
        new L3.b(9);
    }

    @Override // p158w4.a
    public final boolean a(byte[] bArr) {
        String string;
        try {
            string = ((CharsetDecoder) f18052b.get()).decode(ByteBuffer.wrap(bArr)).toString();
        } catch (CharacterCodingException unused) {
            string = null;
        }
        if (string == null) {
            return false;
        }
        this.f18053a.append(string);
        return true;
    }

    @Override // p158w4.a
    public final e b() {
        String string = this.f18053a.toString();
        e eVar = new e();
        eVar.f3813a = string;
        return eVar;
    }
}
