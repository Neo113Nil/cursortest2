package Td;

import Td.AbstractC4045a;
import Td.p;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class b<MessageType extends p> implements r<MessageType> {
    static {
        int i11 = f.f27065b;
    }

    private static void b(p pVar) throws j {
        v vVar;
        if (pVar == null || pVar.isInitialized()) {
            return;
        }
        if (pVar instanceof AbstractC4045a) {
            vVar = new v();
        } else {
            vVar = new v();
        }
        j a11 = vVar.a();
        a11.b(pVar);
        throw a11;
    }

    public final p c(ByteArrayInputStream byteArrayInputStream, f fVar) throws j {
        p pVar;
        try {
            int read = byteArrayInputStream.read();
            if (read == -1) {
                pVar = null;
            } else {
                if ((read & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    read &= 127;
                    int i11 = 7;
                    while (true) {
                        if (i11 >= 32) {
                            while (i11 < 64) {
                                int read2 = byteArrayInputStream.read();
                                if (read2 == -1) {
                                    throw j.d();
                                }
                                if ((read2 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                    i11 += 7;
                                }
                            }
                            throw new j("CodedInputStream encountered a malformed varint.");
                        }
                        int read3 = byteArrayInputStream.read();
                        if (read3 == -1) {
                            throw j.d();
                        }
                        read |= (read3 & 127) << i11;
                        if ((read3 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                            break;
                        }
                        i11 += 7;
                    }
                }
                d c11 = d.c(new AbstractC4045a.AbstractC0542a.C0543a(byteArrayInputStream, read));
                p pVar2 = (p) a(c11, fVar);
                try {
                    c11.a(0);
                    pVar = pVar2;
                } catch (j e11) {
                    e11.b(pVar2);
                    throw e11;
                }
            }
            b(pVar);
            return pVar;
        } catch (IOException e12) {
            throw new j(e12.getMessage());
        }
    }

    public final p d(InputStream inputStream, f fVar) throws j {
        d c11 = d.c(inputStream);
        p pVar = (p) a(c11, fVar);
        try {
            c11.a(0);
            b(pVar);
            return pVar;
        } catch (j e11) {
            e11.b(pVar);
            throw e11;
        }
    }
}
