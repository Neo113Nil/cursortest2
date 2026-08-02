package Ef;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7917a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7918b;

    public m(ArrayList arrayList, Map map) {
        this.f7917a = arrayList;
        this.f7918b = map;
    }

    public byte[] a(Y3.a aVar) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f7917a;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f7918b;
        try {
            dataOutputStream.writeBytes(aVar.f34560a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f34561b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f34562c);
            dataOutputStream.writeLong(aVar.f34563d);
            dataOutputStream.write(aVar.f34564e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public List b() {
        return (ArrayList) this.f7917a;
    }

    public Hf.r c(String str) {
        return (Hf.r) ((Map) this.f7918b).get(str);
    }

    public m() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(UserVerificationMethods.USER_VERIFY_NONE);
        this.f7917a = byteArrayOutputStream;
        this.f7918b = new DataOutputStream(byteArrayOutputStream);
    }
}
