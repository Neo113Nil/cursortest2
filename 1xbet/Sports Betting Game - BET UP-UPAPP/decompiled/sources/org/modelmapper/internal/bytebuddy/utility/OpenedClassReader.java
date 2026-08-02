package org.modelmapper.internal.bytebuddy.utility;

import java.security.AccessController;
import org.modelmapper.internal.asm.ClassReader;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.utility.privilege.GetSystemPropertyAction;

/* loaded from: classes4.dex */
public class OpenedClassReader {
    public static final int ASM_API;
    public static final boolean EXPERIMENTAL;
    public static final String EXPERIMENTAL_PROPERTY = "org.modelmapper.internal.bytebuddy.experimental";

    static {
        boolean z;
        try {
            z = Boolean.parseBoolean((String) AccessController.doPrivileged(new GetSystemPropertyAction(EXPERIMENTAL_PROPERTY)));
        } catch (Exception unused) {
            z = false;
        }
        EXPERIMENTAL = z;
        ASM_API = z ? 17235968 : Opcodes.ASM6;
    }

    private OpenedClassReader() {
        throw new UnsupportedOperationException("This class is a utility class and not supposed to be instantiated");
    }

    public static ClassReader of(byte[] bArr) {
        if (EXPERIMENTAL) {
            byte[] bArr2 = {bArr[4], bArr[5], bArr[6], bArr[7]};
            bArr[4] = 0;
            bArr[5] = 0;
            bArr[6] = 0;
            bArr[7] = 55;
            ClassReader classReader = new ClassReader(bArr);
            System.arraycopy(bArr2, 0, bArr, 4, 4);
            return classReader;
        }
        return new ClassReader(bArr);
    }
}
