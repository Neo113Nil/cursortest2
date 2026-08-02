package org.modelmapper.internal.asm;

/* loaded from: classes4.dex */
public final class ClassTooLargeException extends IndexOutOfBoundsException {
    private final String className;
    private final int constantPoolCount;

    public ClassTooLargeException(String str, int i) {
        super("Class too large: " + str);
        this.className = str;
        this.constantPoolCount = i;
    }

    public String getClassName() {
        return this.className;
    }

    public int getConstantPoolCount() {
        return this.constantPoolCount;
    }
}
