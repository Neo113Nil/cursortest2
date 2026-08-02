package com.sun.jna;

/* loaded from: classes16.dex */
public class DefaultTypeMapper implements com.sun.jna.TypeMapper {
    private java.util.List<com.sun.jna.DefaultTypeMapper.Entry> Camera2StreamConfigurationMap = new java.util.ArrayList();
    private java.util.List<com.sun.jna.DefaultTypeMapper.Entry> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();

    static class Entry {
        public java.lang.Class<?> Camera2StreamConfigurationMap;
        public java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

        public Entry(java.lang.Class<?> cls, java.lang.Object obj) {
            this.Camera2StreamConfigurationMap = cls;
            this.getHighResolutionOutputSizeshNQ4ISI = obj;
        }
    }

    private static java.lang.Class<?> getHighSpeedVideoFpsRanges(java.lang.Class<?> cls) {
        if (cls == java.lang.Boolean.class) {
            return java.lang.Boolean.TYPE;
        }
        if (cls == java.lang.Boolean.TYPE) {
            return java.lang.Boolean.class;
        }
        if (cls == java.lang.Byte.class) {
            return java.lang.Byte.TYPE;
        }
        if (cls == java.lang.Byte.TYPE) {
            return java.lang.Byte.class;
        }
        if (cls == java.lang.Character.class) {
            return java.lang.Character.TYPE;
        }
        if (cls == java.lang.Character.TYPE) {
            return java.lang.Character.class;
        }
        if (cls == java.lang.Short.class) {
            return java.lang.Short.TYPE;
        }
        if (cls == java.lang.Short.TYPE) {
            return java.lang.Short.class;
        }
        if (cls == java.lang.Integer.class) {
            return java.lang.Integer.TYPE;
        }
        if (cls == java.lang.Integer.TYPE) {
            return java.lang.Integer.class;
        }
        if (cls == java.lang.Long.class) {
            return java.lang.Long.TYPE;
        }
        if (cls == java.lang.Long.TYPE) {
            return java.lang.Long.class;
        }
        if (cls == java.lang.Float.class) {
            return java.lang.Float.TYPE;
        }
        if (cls == java.lang.Float.TYPE) {
            return java.lang.Float.class;
        }
        if (cls == java.lang.Double.class) {
            return java.lang.Double.TYPE;
        }
        if (cls == java.lang.Double.TYPE) {
            return java.lang.Double.class;
        }
        return null;
    }

    public void addToNativeConverter(java.lang.Class<?> cls, com.sun.jna.ToNativeConverter toNativeConverter) {
        this.Camera2StreamConfigurationMap.add(new com.sun.jna.DefaultTypeMapper.Entry(cls, toNativeConverter));
        java.lang.Class<?> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(cls);
        if (highSpeedVideoFpsRanges != null) {
            this.Camera2StreamConfigurationMap.add(new com.sun.jna.DefaultTypeMapper.Entry(highSpeedVideoFpsRanges, toNativeConverter));
        }
    }

    public void addFromNativeConverter(java.lang.Class<?> cls, com.sun.jna.FromNativeConverter fromNativeConverter) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(new com.sun.jna.DefaultTypeMapper.Entry(cls, fromNativeConverter));
        java.lang.Class<?> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(cls);
        if (highSpeedVideoFpsRanges != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(new com.sun.jna.DefaultTypeMapper.Entry(highSpeedVideoFpsRanges, fromNativeConverter));
        }
    }

    public void addTypeConverter(java.lang.Class<?> cls, com.sun.jna.TypeConverter typeConverter) {
        addFromNativeConverter(cls, typeConverter);
        addToNativeConverter(cls, typeConverter);
    }

    private static java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.Class<?> cls, java.util.Collection<? extends com.sun.jna.DefaultTypeMapper.Entry> collection) {
        for (com.sun.jna.DefaultTypeMapper.Entry entry : collection) {
            if (entry.Camera2StreamConfigurationMap.isAssignableFrom(cls)) {
                return entry.getHighResolutionOutputSizeshNQ4ISI;
            }
        }
        return null;
    }

    @Override // com.sun.jna.TypeMapper
    public com.sun.jna.FromNativeConverter getFromNativeConverter(java.lang.Class<?> cls) {
        return (com.sun.jna.FromNativeConverter) getHighSpeedVideoFpsRangesFor(cls, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // com.sun.jna.TypeMapper
    public com.sun.jna.ToNativeConverter getToNativeConverter(java.lang.Class<?> cls) {
        return (com.sun.jna.ToNativeConverter) getHighSpeedVideoFpsRangesFor(cls, this.Camera2StreamConfigurationMap);
    }
}
