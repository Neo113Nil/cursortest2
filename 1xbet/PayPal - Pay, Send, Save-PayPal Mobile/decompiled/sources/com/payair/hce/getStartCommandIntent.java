package com.payair.hce;

/* loaded from: classes4.dex */
public class getStartCommandIntent {
    private java.util.Map AlternateContactlessPaymentDataJson;
    private java.io.DataInputStream DigitizedCardProfile;
    private java.util.Map values;
    private java.util.Map writeReplace = new java.util.HashMap();

    private java.lang.Object valueOf(int i, java.lang.Class cls) {
        java.lang.Object readUTF;
        int i2 = 0;
        if (java.util.Map.class.isAssignableFrom(cls)) {
            java.util.Map map = (java.util.Map) cls.newInstance();
            this.writeReplace.put(java.lang.Integer.valueOf(i), map);
            int readInt = this.DigitizedCardProfile.readInt();
            while (i2 < readInt) {
                map.put(RecordsJson(), RecordsJson());
                i2++;
            }
            return map;
        }
        if (java.util.List.class.isAssignableFrom(cls)) {
            java.util.List list = (java.util.List) cls.newInstance();
            this.writeReplace.put(java.lang.Integer.valueOf(i), list);
            int readInt2 = this.DigitizedCardProfile.readInt();
            while (i2 < readInt2) {
                list.add(RecordsJson());
                i2++;
            }
            return list;
        }
        if (java.util.Set.class.isAssignableFrom(cls)) {
            java.util.Set set = (java.util.Set) cls.newInstance();
            this.writeReplace.put(java.lang.Integer.valueOf(i), set);
            int readInt3 = this.DigitizedCardProfile.readInt();
            while (i2 < readInt3) {
                set.add(RecordsJson());
                i2++;
            }
            return set;
        }
        if (cls == java.lang.Boolean.class) {
            readUTF = java.lang.Boolean.valueOf(AlternateContactlessPaymentDataJson());
        } else if (cls == java.lang.Byte.class) {
            readUTF = java.lang.Byte.valueOf(valueOf());
        } else if (cls == java.lang.Character.class) {
            readUTF = java.lang.Character.valueOf(values());
        } else if (cls == java.lang.Short.class) {
            readUTF = java.lang.Short.valueOf(writeReplace());
        } else if (cls == java.lang.Integer.class) {
            readUTF = java.lang.Integer.valueOf(DigitizedCardProfile());
        } else if (cls == java.lang.Long.class) {
            readUTF = java.lang.Long.valueOf(SdkCoreAlternateContactlessPaymentDataImpl());
        } else if (cls == java.lang.Float.class) {
            readUTF = java.lang.Float.valueOf(getProfileVersion());
        } else if (cls == java.lang.Double.class) {
            readUTF = java.lang.Double.valueOf(getAid());
        } else if (cls == java.math.BigDecimal.class) {
            readUTF = new java.math.BigDecimal(this.DigitizedCardProfile.readUTF());
        } else if (cls == java.math.BigInteger.class) {
            readUTF = new java.math.BigInteger(this.DigitizedCardProfile.readUTF());
        } else {
            if (cls != java.lang.String.class) {
                throw new java.lang.IllegalArgumentException("Unsupported class:".concat(java.lang.String.valueOf(cls)));
            }
            readUTF = this.DigitizedCardProfile.readUTF();
        }
        this.writeReplace.put(java.lang.Integer.valueOf(i), readUTF);
        return readUTF;
    }

    public java.lang.Object RecordsJson() {
        try {
            int readInt = this.DigitizedCardProfile.readInt();
            java.lang.Object obj = this.writeReplace.get(java.lang.Integer.valueOf(readInt));
            if (readInt == 0 || obj != null) {
                return obj;
            }
            int readInt2 = this.DigitizedCardProfile.readInt();
            java.lang.Class cls = (java.lang.Class) this.values.get(java.lang.Integer.valueOf(readInt2));
            if (cls == null) {
                return valueOf(readInt, (java.lang.Class) this.AlternateContactlessPaymentDataJson.get(java.lang.Integer.valueOf(readInt2)));
            }
            java.lang.Object newInstance = cls.newInstance();
            this.writeReplace.put(java.lang.Integer.valueOf(readInt), newInstance);
            ((com.payair.hce.stopSelfResultHook) newInstance).values(this);
            return newInstance;
        } catch (java.lang.Exception e) {
            throw new java.io.IOException(e);
        }
    }

    public java.lang.Object DigitizedCardProfile(java.lang.Class cls) {
        java.lang.Object RecordsJson;
        java.lang.Class<?> componentType = cls.getComponentType();
        int readInt = this.DigitizedCardProfile.readInt();
        if (readInt == -1) {
            return null;
        }
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance(componentType, readInt);
        for (int i = 0; i < readInt; i++) {
            if (componentType.isArray()) {
                RecordsJson = DigitizedCardProfile(componentType);
            } else {
                if (componentType == java.lang.Boolean.TYPE) {
                    java.lang.reflect.Array.setBoolean(newInstance, i, AlternateContactlessPaymentDataJson());
                } else if (componentType == java.lang.Byte.TYPE) {
                    java.lang.reflect.Array.setByte(newInstance, i, valueOf());
                } else if (componentType == java.lang.Character.TYPE) {
                    java.lang.reflect.Array.setChar(newInstance, i, values());
                } else if (componentType == java.lang.Short.TYPE) {
                    java.lang.reflect.Array.setShort(newInstance, i, writeReplace());
                } else if (componentType == java.lang.Integer.TYPE) {
                    java.lang.reflect.Array.setInt(newInstance, i, DigitizedCardProfile());
                } else if (componentType == java.lang.Long.TYPE) {
                    java.lang.reflect.Array.setLong(newInstance, i, SdkCoreAlternateContactlessPaymentDataImpl());
                } else if (componentType == java.lang.Float.TYPE) {
                    java.lang.reflect.Array.setFloat(newInstance, i, getProfileVersion());
                } else if (componentType == java.lang.Double.TYPE) {
                    java.lang.reflect.Array.setDouble(newInstance, i, getAid());
                } else {
                    RecordsJson = RecordsJson();
                }
            }
            java.lang.reflect.Array.set(newInstance, i, RecordsJson);
        }
        return newInstance;
    }

    public double getAid() {
        return this.DigitizedCardProfile.readDouble();
    }

    public float getProfileVersion() {
        return this.DigitizedCardProfile.readFloat();
    }

    public long SdkCoreAlternateContactlessPaymentDataImpl() {
        return this.DigitizedCardProfile.readLong();
    }

    public int DigitizedCardProfile() {
        return this.DigitizedCardProfile.readInt();
    }

    public short writeReplace() {
        return this.DigitizedCardProfile.readShort();
    }

    public char values() {
        return this.DigitizedCardProfile.readChar();
    }

    public byte valueOf() {
        return this.DigitizedCardProfile.readByte();
    }

    public boolean AlternateContactlessPaymentDataJson() {
        return this.DigitizedCardProfile.readBoolean();
    }

    public getStartCommandIntent(java.io.InputStream inputStream, java.util.Map map, java.util.Map map2) {
        this.DigitizedCardProfile = new java.io.DataInputStream(inputStream);
        this.values = map;
        this.AlternateContactlessPaymentDataJson = map2;
    }
}
