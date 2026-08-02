package com.sun.jna.win32;

/* loaded from: classes16.dex */
public class W32APITypeMapper extends com.sun.jna.DefaultTypeMapper {
    public static final com.sun.jna.TypeMapper ASCII;
    public static final com.sun.jna.TypeMapper DEFAULT;
    public static final com.sun.jna.TypeMapper UNICODE;

    static {
        com.sun.jna.win32.W32APITypeMapper w32APITypeMapper = new com.sun.jna.win32.W32APITypeMapper(true);
        UNICODE = w32APITypeMapper;
        com.sun.jna.win32.W32APITypeMapper w32APITypeMapper2 = new com.sun.jna.win32.W32APITypeMapper(false);
        ASCII = w32APITypeMapper2;
        if (java.lang.Boolean.getBoolean("w32.ascii")) {
            w32APITypeMapper = w32APITypeMapper2;
        }
        DEFAULT = w32APITypeMapper;
    }

    protected W32APITypeMapper(boolean z) {
        if (z) {
            com.sun.jna.TypeConverter typeConverter = new com.sun.jna.TypeConverter() { // from class: com.sun.jna.win32.W32APITypeMapper.1
                @Override // com.sun.jna.ToNativeConverter
                public java.lang.Object toNative(java.lang.Object obj, com.sun.jna.ToNativeContext toNativeContext) {
                    if (obj == null) {
                        return null;
                    }
                    if (obj instanceof java.lang.String[]) {
                        return new com.sun.jna.StringArray((java.lang.String[]) obj, true);
                    }
                    return new com.sun.jna.WString(obj.toString());
                }

                @Override // com.sun.jna.FromNativeConverter
                public java.lang.Object fromNative(java.lang.Object obj, com.sun.jna.FromNativeContext fromNativeContext) {
                    if (obj == null) {
                        return null;
                    }
                    return obj.toString();
                }

                @Override // com.sun.jna.FromNativeConverter, com.sun.jna.ToNativeConverter
                public java.lang.Class<?> nativeType() {
                    return com.sun.jna.WString.class;
                }
            };
            addTypeConverter(java.lang.String.class, typeConverter);
            addToNativeConverter(java.lang.String[].class, typeConverter);
        }
        addTypeConverter(java.lang.Boolean.class, new com.sun.jna.TypeConverter() { // from class: com.sun.jna.win32.W32APITypeMapper.2
            @Override // com.sun.jna.ToNativeConverter
            public java.lang.Object toNative(java.lang.Object obj, com.sun.jna.ToNativeContext toNativeContext) {
                return java.lang.Integer.valueOf(java.lang.Boolean.TRUE.equals(obj) ? 1 : 0);
            }

            @Override // com.sun.jna.FromNativeConverter
            public java.lang.Object fromNative(java.lang.Object obj, com.sun.jna.FromNativeContext fromNativeContext) {
                return ((java.lang.Integer) obj).intValue() != 0 ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }

            @Override // com.sun.jna.FromNativeConverter, com.sun.jna.ToNativeConverter
            public java.lang.Class<?> nativeType() {
                return java.lang.Integer.class;
            }
        });
    }
}
