package com.sun.jna;

/* loaded from: classes5.dex */
public class Pointer {
    public static final com.sun.jna.Pointer NULL = null;
    protected long peer;

    public static final com.sun.jna.Pointer createConstant(long j) {
        return new com.sun.jna.Pointer.Opaque(j, (byte) 0);
    }

    public static final com.sun.jna.Pointer createConstant(int i) {
        return new com.sun.jna.Pointer.Opaque(i & 4294967295L, (byte) 0);
    }

    Pointer() {
    }

    public Pointer(long j) {
        this.peer = j;
    }

    public com.sun.jna.Pointer share(long j) {
        return share(j, 0L);
    }

    public com.sun.jna.Pointer share(long j, long j2) {
        return j == 0 ? this : new com.sun.jna.Pointer(this.peer + j);
    }

    public void clear(long j) {
        setMemory(0L, j, (byte) 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof com.sun.jna.Pointer) && ((com.sun.jna.Pointer) obj).peer == this.peer;
    }

    public int hashCode() {
        long j = this.peer;
        return (int) ((j >>> 32) + (j & 4294967295L));
    }

    public long indexOf(long j, byte b) {
        return com.sun.jna.Native.indexOf(this, this.peer, j, b);
    }

    public void read(long j, byte[] bArr, int i, int i2) {
        com.sun.jna.Native.read(this, this.peer, j, bArr, i, i2);
    }

    public void read(long j, short[] sArr, int i, int i2) {
        com.sun.jna.Native.read(this, this.peer, j, sArr, i, i2);
    }

    public void read(long j, char[] cArr, int i, int i2) {
        com.sun.jna.Native.read(this, this.peer, j, cArr, i, i2);
    }

    public void read(long j, int[] iArr, int i, int i2) {
        com.sun.jna.Native.read(this, this.peer, j, iArr, i, i2);
    }

    public void read(long j, long[] jArr, int i, int i2) {
        com.sun.jna.Native.read(this, this.peer, j, jArr, i, i2);
    }

    public void read(long j, float[] fArr, int i, int i2) {
        com.sun.jna.Native.read(this, this.peer, j, fArr, i, i2);
    }

    public void read(long j, double[] dArr, int i, int i2) {
        com.sun.jna.Native.read(this, this.peer, j, dArr, i, i2);
    }

    public void read(long j, com.sun.jna.Pointer[] pointerArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            com.sun.jna.Pointer pointer = getPointer((com.sun.jna.Native.POINTER_SIZE * i3) + j);
            int i4 = i3 + i;
            com.sun.jna.Pointer pointer2 = pointerArr[i4];
            if (pointer2 == null || pointer == null || pointer.peer != pointer2.peer) {
                pointerArr[i4] = pointer;
            }
        }
    }

    public void write(long j, byte[] bArr, int i, int i2) {
        com.sun.jna.Native.write(this, this.peer, j, bArr, i, i2);
    }

    public void write(long j, short[] sArr, int i, int i2) {
        com.sun.jna.Native.write(this, this.peer, j, sArr, i, i2);
    }

    public void write(long j, char[] cArr, int i, int i2) {
        com.sun.jna.Native.write(this, this.peer, j, cArr, i, i2);
    }

    public void write(long j, int[] iArr, int i, int i2) {
        com.sun.jna.Native.write(this, this.peer, j, iArr, i, i2);
    }

    public void write(long j, long[] jArr, int i, int i2) {
        com.sun.jna.Native.write(this, this.peer, j, jArr, i, i2);
    }

    public void write(long j, float[] fArr, int i, int i2) {
        com.sun.jna.Native.write(this, this.peer, j, fArr, i, i2);
    }

    public void write(long j, double[] dArr, int i, int i2) {
        com.sun.jna.Native.write(this, this.peer, j, dArr, i, i2);
    }

    public void write(long j, com.sun.jna.Pointer[] pointerArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            setPointer((com.sun.jna.Native.POINTER_SIZE * i3) + j, pointerArr[i + i3]);
        }
    }

    final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(long j, java.lang.Class<?> cls, java.lang.Object obj) {
        com.sun.jna.Pointer directBufferPointer;
        if (com.sun.jna.Structure.class.isAssignableFrom(cls)) {
            com.sun.jna.Structure structure = (com.sun.jna.Structure) obj;
            if (com.sun.jna.Structure.ByReference.class.isAssignableFrom(cls)) {
                return com.sun.jna.Structure.getHighSpeedVideoFpsRanges((java.lang.Class<com.sun.jna.Structure>) cls, structure, getPointer(j));
            }
            structure.getHighSpeedVideoFpsRanges(this, (int) j, true);
            structure.read();
            return structure;
        }
        if (cls == java.lang.Boolean.TYPE || cls == java.lang.Boolean.class) {
            return com.sun.jna.Function.getHighSpeedVideoFpsRanges(getInt(j) != 0);
        }
        if (cls == java.lang.Byte.TYPE || cls == java.lang.Byte.class) {
            return java.lang.Byte.valueOf(getByte(j));
        }
        if (cls == java.lang.Short.TYPE || cls == java.lang.Short.class) {
            return java.lang.Short.valueOf(getShort(j));
        }
        if (cls == java.lang.Character.TYPE || cls == java.lang.Character.class) {
            return java.lang.Character.valueOf(getChar(j));
        }
        if (cls == java.lang.Integer.TYPE || cls == java.lang.Integer.class) {
            return java.lang.Integer.valueOf(getInt(j));
        }
        if (cls == java.lang.Long.TYPE || cls == java.lang.Long.class) {
            return java.lang.Long.valueOf(getLong(j));
        }
        if (cls == java.lang.Float.TYPE || cls == java.lang.Float.class) {
            return java.lang.Float.valueOf(getFloat(j));
        }
        if (cls == java.lang.Double.TYPE || cls == java.lang.Double.class) {
            return java.lang.Double.valueOf(getDouble(j));
        }
        if (com.sun.jna.Pointer.class.isAssignableFrom(cls)) {
            com.sun.jna.Pointer pointer = getPointer(j);
            if (pointer == null) {
                return null;
            }
            directBufferPointer = obj instanceof com.sun.jna.Pointer ? (com.sun.jna.Pointer) obj : null;
            return (directBufferPointer == null || pointer.peer != directBufferPointer.peer) ? pointer : directBufferPointer;
        }
        if (cls == java.lang.String.class) {
            com.sun.jna.Pointer pointer2 = getPointer(j);
            if (pointer2 != null) {
                return pointer2.getString(0L);
            }
            return null;
        }
        if (cls == com.sun.jna.WString.class) {
            com.sun.jna.Pointer pointer3 = getPointer(j);
            if (pointer3 != null) {
                return new com.sun.jna.WString(pointer3.getWideString(0L));
            }
            return null;
        }
        if (com.sun.jna.Callback.class.isAssignableFrom(cls)) {
            com.sun.jna.Pointer pointer4 = getPointer(j);
            if (pointer4 == null) {
                return null;
            }
            com.sun.jna.Callback callback = (com.sun.jna.Callback) obj;
            return !pointer4.equals(com.sun.jna.CallbackReference.getFunctionPointer(callback)) ? com.sun.jna.CallbackReference.getCallback(cls, pointer4) : callback;
        }
        if (com.sun.jna.Platform.HAS_BUFFERS && java.nio.Buffer.class.isAssignableFrom(cls)) {
            com.sun.jna.Pointer pointer5 = getPointer(j);
            if (pointer5 == null) {
                return null;
            }
            directBufferPointer = obj != null ? com.sun.jna.Native.getDirectBufferPointer((java.nio.Buffer) obj) : null;
            if (directBufferPointer == null || !directBufferPointer.equals(pointer5)) {
                throw new java.lang.IllegalStateException("Can't autogenerate a direct buffer on memory read");
            }
            return obj;
        }
        if (com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
            com.sun.jna.NativeMapped nativeMapped = (com.sun.jna.NativeMapped) obj;
            if (nativeMapped != null) {
                java.lang.Object fromNative = nativeMapped.fromNative(getHighResolutionOutputSizeshNQ4ISI(j, nativeMapped.nativeType(), (java.lang.Object) null), new com.sun.jna.FromNativeContext(cls));
                return nativeMapped.equals(fromNative) ? nativeMapped : fromNative;
            }
            com.sun.jna.NativeMappedConverter nativeMappedConverter = com.sun.jna.NativeMappedConverter.getInstance(cls);
            return nativeMappedConverter.fromNative(getHighResolutionOutputSizeshNQ4ISI(j, nativeMappedConverter.nativeType(), (java.lang.Object) null), new com.sun.jna.FromNativeContext(cls));
        }
        if (cls.isArray()) {
            if (obj == null) {
                throw new java.lang.IllegalStateException("Need an initialized array");
            }
            getHighResolutionOutputSizeshNQ4ISI(j, obj, cls.getComponentType());
            return obj;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Reading \"");
        sb.append(cls);
        sb.append("\" from memory is not supported");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private void getHighResolutionOutputSizeshNQ4ISI(long j, java.lang.Object obj, java.lang.Class<?> cls) {
        int length = java.lang.reflect.Array.getLength(obj);
        if (cls == java.lang.Byte.TYPE) {
            read(j, (byte[]) obj, 0, length);
            return;
        }
        if (cls == java.lang.Short.TYPE) {
            read(j, (short[]) obj, 0, length);
            return;
        }
        if (cls == java.lang.Character.TYPE) {
            read(j, (char[]) obj, 0, length);
            return;
        }
        if (cls == java.lang.Integer.TYPE) {
            read(j, (int[]) obj, 0, length);
            return;
        }
        if (cls == java.lang.Long.TYPE) {
            read(j, (long[]) obj, 0, length);
            return;
        }
        if (cls == java.lang.Float.TYPE) {
            read(j, (float[]) obj, 0, length);
            return;
        }
        if (cls == java.lang.Double.TYPE) {
            read(j, (double[]) obj, 0, length);
            return;
        }
        if (com.sun.jna.Pointer.class.isAssignableFrom(cls)) {
            read(j, (com.sun.jna.Pointer[]) obj, 0, length);
            return;
        }
        int i = 0;
        if (com.sun.jna.Structure.class.isAssignableFrom(cls)) {
            com.sun.jna.Structure[] structureArr = (com.sun.jna.Structure[]) obj;
            if (com.sun.jna.Structure.ByReference.class.isAssignableFrom(cls)) {
                com.sun.jna.Pointer[] pointerArray = getPointerArray(j, structureArr.length);
                while (i < structureArr.length) {
                    structureArr[i] = com.sun.jna.Structure.getHighSpeedVideoFpsRanges((java.lang.Class<com.sun.jna.Structure>) cls, structureArr[i], pointerArray[i]);
                    i++;
                }
                return;
            }
            com.sun.jna.Structure structure = structureArr[0];
            if (structure == null) {
                structure = com.sun.jna.Structure.newInstance((java.lang.Class<com.sun.jna.Structure>) cls, share(j));
                if (!structure.readCalled) {
                    structure.autoRead();
                }
                structureArr[0] = structure;
            } else {
                structure.getHighSpeedVideoFpsRanges(this, (int) j, true);
                structure.read();
            }
            com.sun.jna.Structure[] array = structure.toArray(structureArr.length);
            for (int i2 = 1; i2 < structureArr.length; i2++) {
                com.sun.jna.Structure structure2 = structureArr[i2];
                if (structure2 == null) {
                    structureArr[i2] = array[i2];
                } else {
                    structure2.getHighSpeedVideoFpsRanges(this, (int) ((structure2.size() * i2) + j), true);
                    structureArr[i2].read();
                }
            }
            return;
        }
        if (com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
            com.sun.jna.NativeMapped[] nativeMappedArr = (com.sun.jna.NativeMapped[]) obj;
            com.sun.jna.NativeMappedConverter nativeMappedConverter = com.sun.jna.NativeMappedConverter.getInstance(cls);
            int nativeSize = com.sun.jna.Native.getNativeSize(obj.getClass(), obj) / nativeMappedArr.length;
            while (i < nativeMappedArr.length) {
                nativeMappedArr[i] = (com.sun.jna.NativeMapped) nativeMappedConverter.fromNative(getHighResolutionOutputSizeshNQ4ISI((nativeSize * i) + j, nativeMappedConverter.nativeType(), nativeMappedArr[i]), new com.sun.jna.FromNativeContext(cls));
                i++;
            }
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Reading array of ");
        sb.append(cls);
        sb.append(" from memory not supported");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public byte getByte(long j) {
        return com.sun.jna.Native.getByte(this, this.peer, j);
    }

    public char getChar(long j) {
        return com.sun.jna.Native.getChar(this, this.peer, j);
    }

    public short getShort(long j) {
        return com.sun.jna.Native.getShort(this, this.peer, j);
    }

    public int getInt(long j) {
        return com.sun.jna.Native.getInt(this, this.peer, j);
    }

    public long getLong(long j) {
        return com.sun.jna.Native.getLong(this, this.peer, j);
    }

    public com.sun.jna.NativeLong getNativeLong(long j) {
        return new com.sun.jna.NativeLong(com.sun.jna.NativeLong.SIZE == 8 ? getLong(j) : getInt(j));
    }

    public float getFloat(long j) {
        return com.sun.jna.Native.getFloat(this, this.peer, j);
    }

    public double getDouble(long j) {
        return com.sun.jna.Native.getDouble(this, this.peer, j);
    }

    public com.sun.jna.Pointer getPointer(long j) {
        return com.sun.jna.Native.getHighSpeedVideoFpsRanges(this.peer + j);
    }

    public java.nio.ByteBuffer getByteBuffer(long j, long j2) {
        return com.sun.jna.Native.getDirectByteBuffer(this, this.peer, j, j2).order(java.nio.ByteOrder.nativeOrder());
    }

    public java.lang.String getWideString(long j) {
        return com.sun.jna.Native.getWideString(this, this.peer, j);
    }

    public java.lang.String getString(long j) {
        return getString(j, com.sun.jna.Native.getDefaultStringEncoding());
    }

    public java.lang.String getString(long j, java.lang.String str) {
        return com.sun.jna.Native.getHighResolutionOutputSizeshNQ4ISI(this, j, str);
    }

    public byte[] getByteArray(long j, int i) {
        byte[] bArr = new byte[i];
        read(j, bArr, 0, i);
        return bArr;
    }

    public char[] getCharArray(long j, int i) {
        char[] cArr = new char[i];
        read(j, cArr, 0, i);
        return cArr;
    }

    public short[] getShortArray(long j, int i) {
        short[] sArr = new short[i];
        read(j, sArr, 0, i);
        return sArr;
    }

    public int[] getIntArray(long j, int i) {
        int[] iArr = new int[i];
        read(j, iArr, 0, i);
        return iArr;
    }

    public long[] getLongArray(long j, int i) {
        long[] jArr = new long[i];
        read(j, jArr, 0, i);
        return jArr;
    }

    public float[] getFloatArray(long j, int i) {
        float[] fArr = new float[i];
        read(j, fArr, 0, i);
        return fArr;
    }

    public double[] getDoubleArray(long j, int i) {
        double[] dArr = new double[i];
        read(j, dArr, 0, i);
        return dArr;
    }

    public com.sun.jna.Pointer[] getPointerArray(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.sun.jna.Pointer pointer = getPointer(j);
        int i = 0;
        while (pointer != null) {
            arrayList.add(pointer);
            i += com.sun.jna.Native.POINTER_SIZE;
            pointer = getPointer(i + j);
        }
        return (com.sun.jna.Pointer[]) arrayList.toArray(new com.sun.jna.Pointer[0]);
    }

    public com.sun.jna.Pointer[] getPointerArray(long j, int i) {
        com.sun.jna.Pointer[] pointerArr = new com.sun.jna.Pointer[i];
        read(j, pointerArr, 0, i);
        return pointerArr;
    }

    public java.lang.String[] getStringArray(long j) {
        return getStringArray(j, -1, com.sun.jna.Native.getDefaultStringEncoding());
    }

    public java.lang.String[] getStringArray(long j, java.lang.String str) {
        return getStringArray(j, -1, str);
    }

    public java.lang.String[] getStringArray(long j, int i) {
        return getStringArray(j, i, com.sun.jna.Native.getDefaultStringEncoding());
    }

    public java.lang.String[] getWideStringArray(long j) {
        return getWideStringArray(j, -1);
    }

    public java.lang.String[] getWideStringArray(long j, int i) {
        return getStringArray(j, i, "--WIDE-STRING--");
    }

    public java.lang.String[] getStringArray(long j, int i, java.lang.String str) {
        java.lang.String string;
        java.lang.String wideString;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i == -1) {
            int i2 = 0;
            while (true) {
                com.sun.jna.Pointer pointer = getPointer(i2 + j);
                if (pointer == null) {
                    break;
                }
                if ("--WIDE-STRING--".equals(str)) {
                    string = pointer.getWideString(0L);
                } else {
                    string = pointer.getString(0L, str);
                }
                arrayList.add(string);
                i2 += com.sun.jna.Native.POINTER_SIZE;
            }
        } else {
            com.sun.jna.Pointer pointer2 = getPointer(j);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= i) {
                    break;
                }
                if (pointer2 == null) {
                    wideString = null;
                } else {
                    wideString = "--WIDE-STRING--".equals(str) ? pointer2.getWideString(0L) : pointer2.getString(0L, str);
                }
                arrayList.add(wideString);
                if (i5 < i) {
                    i4 += com.sun.jna.Native.POINTER_SIZE;
                    pointer2 = getPointer(i4 + j);
                }
                i3 = i5;
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0116, code lost:
    
        if (r5 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0118, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0121, code lost:
    
        setLong(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0124, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x011b, code lost:
    
        r5 = ((java.lang.Long) r5).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0125, code lost:
    
        if (r5 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0127, code lost:
    
        r1 = ((java.lang.Integer) r5).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x012d, code lost:
    
        setInt(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0130, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0131, code lost:
    
        if (r5 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0133, code lost:
    
        r1 = ((java.lang.Character) r5).charValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0139, code lost:
    
        setChar(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x013c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x013d, code lost:
    
        if (r5 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x013f, code lost:
    
        r1 = ((java.lang.Short) r5).shortValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0145, code lost:
    
        setShort(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0148, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0149, code lost:
    
        if (r5 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x014b, code lost:
    
        r1 = ((java.lang.Byte) r5).byteValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0151, code lost:
    
        setByte(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0154, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x015b, code lost:
    
        if (java.lang.Boolean.TRUE.equals(r5) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x015d, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x015e, code lost:
    
        setInt(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0161, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f9, code lost:
    
        if (r5 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00fb, code lost:
    
        r5 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0104, code lost:
    
        setDouble(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0107, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00fe, code lost:
    
        r5 = ((java.lang.Double) r5).doubleValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0108, code lost:
    
        if (r5 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x010a, code lost:
    
        r5 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0112, code lost:
    
        setFloat(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0115, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x010c, code lost:
    
        r5 = ((java.lang.Float) r5).floatValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighSpeedVideoSizes(long j, java.lang.Object obj, java.lang.Class<?> cls) {
        while (true) {
            int i = 0;
            int i2 = 0;
            char c = 0;
            short s = 0;
            byte b = 0;
            if (cls == java.lang.Boolean.TYPE || cls == java.lang.Boolean.class) {
                break;
            }
            if (cls == java.lang.Byte.TYPE || cls == java.lang.Byte.class) {
                break;
            }
            if (cls == java.lang.Short.TYPE || cls == java.lang.Short.class) {
                break;
            }
            if (cls == java.lang.Character.TYPE || cls == java.lang.Character.class) {
                break;
            }
            if (cls == java.lang.Integer.TYPE || cls == java.lang.Integer.class) {
                break;
            }
            if (cls == java.lang.Long.TYPE || cls == java.lang.Long.class) {
                break;
            }
            if (cls == java.lang.Float.TYPE || cls == java.lang.Float.class) {
                break;
            }
            if (cls == java.lang.Double.TYPE || cls == java.lang.Double.class) {
                break;
            }
            if (cls == com.sun.jna.Pointer.class) {
                setPointer(j, (com.sun.jna.Pointer) obj);
                return;
            }
            if (cls == java.lang.String.class) {
                setPointer(j, (com.sun.jna.Pointer) obj);
                return;
            }
            if (cls == com.sun.jna.WString.class) {
                setPointer(j, (com.sun.jna.Pointer) obj);
                return;
            }
            if (com.sun.jna.Structure.class.isAssignableFrom(cls)) {
                com.sun.jna.Structure structure = (com.sun.jna.Structure) obj;
                if (com.sun.jna.Structure.ByReference.class.isAssignableFrom(cls)) {
                    setPointer(j, structure != null ? structure.getPointer() : null);
                    if (structure != null) {
                        structure.autoWrite();
                        return;
                    }
                    return;
                }
                structure.getHighSpeedVideoFpsRanges(this, (int) j, true);
                structure.write();
                return;
            }
            if (com.sun.jna.Callback.class.isAssignableFrom(cls)) {
                setPointer(j, com.sun.jna.CallbackReference.getFunctionPointer((com.sun.jna.Callback) obj));
                return;
            }
            if (com.sun.jna.Platform.HAS_BUFFERS && java.nio.Buffer.class.isAssignableFrom(cls)) {
                setPointer(j, obj != null ? com.sun.jna.Native.getDirectBufferPointer((java.nio.Buffer) obj) : null);
                return;
            }
            if (com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
                com.sun.jna.NativeMappedConverter nativeMappedConverter = com.sun.jna.NativeMappedConverter.getInstance(cls);
                java.lang.Class<?> nativeType = nativeMappedConverter.nativeType();
                obj = nativeMappedConverter.toNative(obj, new com.sun.jna.ToNativeContext());
                cls = nativeType;
            } else {
                if (cls.isArray()) {
                    getHighSpeedVideoFpsRangesFor(j, obj, cls.getComponentType());
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Writing ");
                sb.append(cls);
                sb.append(" to memory is not supported");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
    }

    private void getHighSpeedVideoFpsRangesFor(long j, java.lang.Object obj, java.lang.Class<?> cls) {
        if (cls == java.lang.Byte.TYPE) {
            byte[] bArr = (byte[]) obj;
            write(j, bArr, 0, bArr.length);
            return;
        }
        if (cls == java.lang.Short.TYPE) {
            short[] sArr = (short[]) obj;
            write(j, sArr, 0, sArr.length);
            return;
        }
        if (cls == java.lang.Character.TYPE) {
            char[] cArr = (char[]) obj;
            write(j, cArr, 0, cArr.length);
            return;
        }
        if (cls == java.lang.Integer.TYPE) {
            int[] iArr = (int[]) obj;
            write(j, iArr, 0, iArr.length);
            return;
        }
        if (cls == java.lang.Long.TYPE) {
            long[] jArr = (long[]) obj;
            write(j, jArr, 0, jArr.length);
            return;
        }
        if (cls == java.lang.Float.TYPE) {
            float[] fArr = (float[]) obj;
            write(j, fArr, 0, fArr.length);
            return;
        }
        if (cls == java.lang.Double.TYPE) {
            double[] dArr = (double[]) obj;
            write(j, dArr, 0, dArr.length);
            return;
        }
        if (com.sun.jna.Pointer.class.isAssignableFrom(cls)) {
            com.sun.jna.Pointer[] pointerArr = (com.sun.jna.Pointer[]) obj;
            write(j, pointerArr, 0, pointerArr.length);
            return;
        }
        int i = 0;
        if (com.sun.jna.Structure.class.isAssignableFrom(cls)) {
            com.sun.jna.Structure[] structureArr = (com.sun.jna.Structure[]) obj;
            if (com.sun.jna.Structure.ByReference.class.isAssignableFrom(cls)) {
                int length = structureArr.length;
                com.sun.jna.Pointer[] pointerArr2 = new com.sun.jna.Pointer[length];
                while (i < structureArr.length) {
                    com.sun.jna.Structure structure = structureArr[i];
                    if (structure == null) {
                        pointerArr2[i] = null;
                    } else {
                        pointerArr2[i] = structure.getPointer();
                        structureArr[i].write();
                    }
                    i++;
                }
                write(j, pointerArr2, 0, length);
                return;
            }
            com.sun.jna.Structure structure2 = structureArr[0];
            if (structure2 == null) {
                structure2 = com.sun.jna.Structure.newInstance((java.lang.Class<com.sun.jna.Structure>) cls, share(j));
                structureArr[0] = structure2;
            } else {
                structure2.getHighSpeedVideoFpsRanges(this, (int) j, true);
            }
            structure2.write();
            com.sun.jna.Structure[] array = structure2.toArray(structureArr.length);
            for (int i2 = 1; i2 < structureArr.length; i2++) {
                com.sun.jna.Structure structure3 = structureArr[i2];
                if (structure3 == null) {
                    structureArr[i2] = array[i2];
                } else {
                    structure3.getHighSpeedVideoFpsRanges(this, (int) ((structure3.size() * i2) + j), true);
                }
                structureArr[i2].write();
            }
            return;
        }
        if (com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
            com.sun.jna.NativeMapped[] nativeMappedArr = (com.sun.jna.NativeMapped[]) obj;
            com.sun.jna.NativeMappedConverter nativeMappedConverter = com.sun.jna.NativeMappedConverter.getInstance(cls);
            java.lang.Class<?> nativeType = nativeMappedConverter.nativeType();
            int nativeSize = com.sun.jna.Native.getNativeSize(obj.getClass(), obj) / nativeMappedArr.length;
            while (i < nativeMappedArr.length) {
                getHighSpeedVideoSizes((i * nativeSize) + j, nativeMappedConverter.toNative(nativeMappedArr[i], new com.sun.jna.ToNativeContext()), nativeType);
                i++;
            }
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Writing array of ");
        sb.append(cls);
        sb.append(" to memory not supported");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public void setMemory(long j, long j2, byte b) {
        com.sun.jna.Native.setMemory(this, this.peer, j, j2, b);
    }

    public void setByte(long j, byte b) {
        com.sun.jna.Native.setByte(this, this.peer, j, b);
    }

    public void setShort(long j, short s) {
        com.sun.jna.Native.setShort(this, this.peer, j, s);
    }

    public void setChar(long j, char c) {
        com.sun.jna.Native.setChar(this, this.peer, j, c);
    }

    public void setInt(long j, int i) {
        com.sun.jna.Native.setInt(this, this.peer, j, i);
    }

    public void setLong(long j, long j2) {
        com.sun.jna.Native.setLong(this, this.peer, j, j2);
    }

    public void setNativeLong(long j, com.sun.jna.NativeLong nativeLong) {
        if (com.sun.jna.NativeLong.SIZE == 8) {
            setLong(j, nativeLong.longValue());
        } else {
            setInt(j, nativeLong.intValue());
        }
    }

    public void setFloat(long j, float f) {
        com.sun.jna.Native.setFloat(this, this.peer, j, f);
    }

    public void setDouble(long j, double d) {
        com.sun.jna.Native.setDouble(this, this.peer, j, d);
    }

    public void setPointer(long j, com.sun.jna.Pointer pointer) {
        com.sun.jna.Native.setPointer(this, this.peer, j, pointer != null ? pointer.peer : 0L);
    }

    public void setWideString(long j, java.lang.String str) {
        com.sun.jna.Native.setWideString(this, this.peer, j, str);
    }

    public void setString(long j, com.sun.jna.WString wString) {
        setWideString(j, wString == null ? null : wString.toString());
    }

    public void setString(long j, java.lang.String str) {
        setString(j, str, com.sun.jna.Native.getDefaultStringEncoding());
    }

    public void setString(long j, java.lang.String str, java.lang.String str2) {
        byte[] highSpeedVideoSizes = com.sun.jna.Native.getHighSpeedVideoSizes(str, str2);
        write(j, highSpeedVideoSizes, 0, highSpeedVideoSizes.length);
        setByte(highSpeedVideoSizes.length + j, (byte) 0);
    }

    public java.lang.String dump(long j, int i) {
        java.io.StringWriter stringWriter = new java.io.StringWriter((i * 2) + 13 + ((i / 4) * 4));
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        printWriter.println("memory dump");
        for (int i2 = 0; i2 < i; i2++) {
            byte b = getByte(i2 + j);
            int i3 = i2 % 4;
            if (i3 == 0) {
                printWriter.print("[");
            }
            if (b >= 0 && b < 16) {
                printWriter.print("0");
            }
            printWriter.print(java.lang.Integer.toHexString(b & 255));
            if (i3 == 3 && i2 < i - 1) {
                printWriter.println("]");
            }
        }
        if (stringWriter.getBuffer().charAt(stringWriter.getBuffer().length() - 2) != ']') {
            printWriter.println("]");
        }
        return stringWriter.toString();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("native@0x");
        sb.append(java.lang.Long.toHexString(this.peer));
        return sb.toString();
    }

    public static long nativeValue(com.sun.jna.Pointer pointer) {
        if (pointer == null) {
            return 0L;
        }
        return pointer.peer;
    }

    public static void nativeValue(com.sun.jna.Pointer pointer, long j) {
        pointer.peer = j;
    }

    /* loaded from: classes16.dex */
    static class Opaque extends com.sun.jna.Pointer {
        private final java.lang.String Camera2StreamConfigurationMap;

        /* synthetic */ Opaque(long j, byte b) {
            this(j);
        }

        private Opaque(long j) {
            super(j);
            this.Camera2StreamConfigurationMap = "This pointer is opaque: ".concat(java.lang.String.valueOf(this));
        }

        @Override // com.sun.jna.Pointer
        public com.sun.jna.Pointer share(long j, long j2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void clear(long j) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public long indexOf(long j, byte b) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, byte[] bArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, char[] cArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, short[] sArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, int[] iArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, long[] jArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, float[] fArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, double[] dArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, com.sun.jna.Pointer[] pointerArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, byte[] bArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, char[] cArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, short[] sArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, int[] iArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, long[] jArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, float[] fArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, double[] dArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, com.sun.jna.Pointer[] pointerArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public java.nio.ByteBuffer getByteBuffer(long j, long j2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public byte getByte(long j) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public char getChar(long j) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public short getShort(long j) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public int getInt(long j) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public long getLong(long j) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public float getFloat(long j) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public double getDouble(long j) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public com.sun.jna.Pointer getPointer(long j) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public java.lang.String getString(long j, java.lang.String str) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public java.lang.String getWideString(long j) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void setByte(long j, byte b) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void setChar(long j, char c) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void setShort(long j, short s) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void setInt(long j, int i) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void setLong(long j, long j2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void setFloat(long j, float f) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void setDouble(long j, double d) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void setPointer(long j, com.sun.jna.Pointer pointer) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void setString(long j, java.lang.String str, java.lang.String str2) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void setWideString(long j, java.lang.String str) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public void setMemory(long j, long j2, byte b) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public java.lang.String dump(long j, int i) {
            throw new java.lang.UnsupportedOperationException(this.Camera2StreamConfigurationMap);
        }

        @Override // com.sun.jna.Pointer
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("const@0x");
            sb.append(java.lang.Long.toHexString(this.peer));
            return sb.toString();
        }
    }
}
