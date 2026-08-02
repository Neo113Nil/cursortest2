package com.sun.jna;

/* loaded from: classes5.dex */
public class StringArray extends com.sun.jna.Memory implements com.sun.jna.Function.PostCallRead {
    private java.util.List<com.sun.jna.NativeString> Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.Object[] getHighSpeedVideoFpsRangesFor;

    public StringArray(java.lang.String[] strArr) {
        this(strArr, false);
    }

    public StringArray(java.lang.String[] strArr, boolean z) {
        this((java.lang.Object[]) strArr, z ? "--WIDE-STRING--" : com.sun.jna.Native.getDefaultStringEncoding());
    }

    public StringArray(java.lang.String[] strArr, java.lang.String str) {
        this((java.lang.Object[]) strArr, str);
    }

    public StringArray(com.sun.jna.WString[] wStringArr) {
        this(wStringArr, "--WIDE-STRING--");
    }

    private StringArray(java.lang.Object[] objArr, java.lang.String str) {
        super((objArr.length + 1) * com.sun.jna.Native.POINTER_SIZE);
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRangesFor = objArr;
        this.getHighSpeedVideoFpsRanges = str;
        int i = 0;
        while (true) {
            com.sun.jna.Pointer pointer = null;
            if (i < objArr.length) {
                java.lang.Object obj = objArr[i];
                if (obj != null) {
                    com.sun.jna.NativeString nativeString = new com.sun.jna.NativeString(obj.toString(), str);
                    this.Camera2StreamConfigurationMap.add(nativeString);
                    pointer = nativeString.getHighSpeedVideoFpsRangesFor;
                }
                setPointer(com.sun.jna.Native.POINTER_SIZE * i, pointer);
                i++;
            } else {
                setPointer(com.sun.jna.Native.POINTER_SIZE * objArr.length, null);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.sun.jna.WString] */
    @Override // com.sun.jna.Function.PostCallRead
    public void read() {
        java.lang.String str;
        boolean z = this.getHighSpeedVideoFpsRangesFor instanceof com.sun.jna.WString[];
        boolean equals = "--WIDE-STRING--".equals(this.getHighSpeedVideoFpsRanges);
        for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor.length; i++) {
            com.sun.jna.Pointer pointer = getPointer(com.sun.jna.Native.POINTER_SIZE * i);
            if (pointer != null) {
                str = equals ? pointer.getWideString(0L) : pointer.getString(0L, this.getHighSpeedVideoFpsRanges);
                if (z) {
                    str = new com.sun.jna.WString(str);
                }
            } else {
                str = null;
            }
            this.getHighSpeedVideoFpsRangesFor[i] = str;
        }
    }

    @Override // com.sun.jna.Memory, com.sun.jna.Pointer
    public java.lang.String toString() {
        java.lang.String str = "--WIDE-STRING--".equals(this.getHighSpeedVideoFpsRanges) ? "const wchar_t*[]" : "const char*[]";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(java.util.Arrays.asList(this.getHighSpeedVideoFpsRangesFor));
        return sb.toString();
    }
}
