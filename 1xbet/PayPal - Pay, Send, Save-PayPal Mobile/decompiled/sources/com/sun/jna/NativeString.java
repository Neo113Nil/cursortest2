package com.sun.jna;

/* loaded from: classes5.dex */
class NativeString implements java.lang.CharSequence, java.lang.Comparable {
    private java.lang.String getHighSpeedVideoFpsRanges;
    com.sun.jna.Pointer getHighSpeedVideoFpsRangesFor;

    class StringMemory extends com.sun.jna.Memory {
        public StringMemory(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public java.lang.String toString() {
            return com.sun.jna.NativeString.this.toString();
        }
    }

    public NativeString(java.lang.String str, boolean z) {
        this(str, z ? "--WIDE-STRING--" : com.sun.jna.Native.getDefaultStringEncoding());
    }

    public NativeString(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("String must not be null");
        }
        this.getHighSpeedVideoFpsRanges = str2;
        if ("--WIDE-STRING--".equals(str2)) {
            com.sun.jna.NativeString.StringMemory stringMemory = new com.sun.jna.NativeString.StringMemory((str.length() + 1) * com.sun.jna.Native.WCHAR_SIZE);
            this.getHighSpeedVideoFpsRangesFor = stringMemory;
            stringMemory.setWideString(0L, str);
            return;
        }
        byte[] highSpeedVideoSizes = com.sun.jna.Native.getHighSpeedVideoSizes(str, str2);
        com.sun.jna.NativeString.StringMemory stringMemory2 = new com.sun.jna.NativeString.StringMemory(highSpeedVideoSizes.length + 1);
        this.getHighSpeedVideoFpsRangesFor = stringMemory2;
        stringMemory2.write(0L, highSpeedVideoSizes, 0, highSpeedVideoSizes.length);
        this.getHighSpeedVideoFpsRangesFor.setByte(highSpeedVideoSizes.length, (byte) 0);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof java.lang.CharSequence) && compareTo(obj) == 0;
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return "--WIDE-STRING--".equals(this.getHighSpeedVideoFpsRanges) ? this.getHighSpeedVideoFpsRangesFor.getWideString(0L) : this.getHighSpeedVideoFpsRangesFor.getString(0L, this.getHighSpeedVideoFpsRanges);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return toString().charAt(i);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        if (obj == null) {
            return 1;
        }
        return toString().compareTo(obj.toString());
    }
}
