package com.sun.jna;

/* loaded from: classes5.dex */
public abstract class Union extends com.sun.jna.Structure {
    private com.sun.jna.Structure.StructField getHighSpeedVideoFpsRangesFor;

    protected Union() {
    }

    protected Union(com.sun.jna.Pointer pointer) {
        super(pointer);
    }

    protected Union(com.sun.jna.Pointer pointer, int i) {
        super(pointer, i);
    }

    protected Union(com.sun.jna.TypeMapper typeMapper) {
        super(typeMapper);
    }

    protected Union(com.sun.jna.Pointer pointer, int i, com.sun.jna.TypeMapper typeMapper) {
        super(pointer, i, typeMapper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.sun.jna.Structure
    /* renamed from: getFieldOrder */
    public java.util.List<java.lang.String> getHighSpeedVideoSizes() {
        java.util.List<java.lang.reflect.Field> fieldList = getFieldList();
        java.util.ArrayList arrayList = new java.util.ArrayList(fieldList.size());
        java.util.Iterator<java.lang.reflect.Field> it = fieldList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    public void setType(java.lang.Class<?> cls) {
        ensureAllocated();
        for (com.sun.jna.Structure.StructField structField : Camera2StreamConfigurationMap().values()) {
            if (structField.type == cls) {
                this.getHighSpeedVideoFpsRangesFor = structField;
                return;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No field of type ");
        sb.append(cls);
        sb.append(" in ");
        sb.append(this);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public void setType(java.lang.String str) {
        ensureAllocated();
        com.sun.jna.Structure.StructField structField = Camera2StreamConfigurationMap().get(str);
        if (structField != null) {
            this.getHighSpeedVideoFpsRangesFor = structField;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No field named ");
        sb.append(str);
        sb.append(" in ");
        sb.append(this);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // com.sun.jna.Structure
    public java.lang.Object readField(java.lang.String str) {
        ensureAllocated();
        setType(str);
        return super.readField(str);
    }

    @Override // com.sun.jna.Structure
    public void writeField(java.lang.String str) {
        ensureAllocated();
        setType(str);
        super.writeField(str);
    }

    @Override // com.sun.jna.Structure
    public void writeField(java.lang.String str, java.lang.Object obj) {
        ensureAllocated();
        setType(str);
        super.writeField(str, obj);
    }

    public java.lang.Object getTypedValue(java.lang.Class<?> cls) {
        ensureAllocated();
        for (com.sun.jna.Structure.StructField structField : Camera2StreamConfigurationMap().values()) {
            if (structField.type == cls) {
                this.getHighSpeedVideoFpsRangesFor = structField;
                read();
                return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor.field);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No field of type ");
        sb.append(cls);
        sb.append(" in ");
        sb.append(this);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public java.lang.Object setTypedValue(java.lang.Object obj) {
        com.sun.jna.Structure.StructField structField;
        java.lang.Class<?> cls = obj.getClass();
        ensureAllocated();
        java.util.Iterator<com.sun.jna.Structure.StructField> it = Camera2StreamConfigurationMap().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                structField = null;
                break;
            }
            structField = it.next();
            if (structField.type.isAssignableFrom(cls)) {
                break;
            }
        }
        if (structField != null) {
            this.getHighSpeedVideoFpsRangesFor = structField;
            Camera2StreamConfigurationMap(structField.field, obj);
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No field of type ");
        sb.append(obj.getClass());
        sb.append(" in ");
        sb.append(this);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // com.sun.jna.Structure
    protected void writeField(com.sun.jna.Structure.StructField structField) {
        if (structField == this.getHighSpeedVideoFpsRangesFor) {
            super.writeField(structField);
        }
    }

    @Override // com.sun.jna.Structure
    protected java.lang.Object readField(com.sun.jna.Structure.StructField structField) {
        if (structField == this.getHighSpeedVideoFpsRangesFor || !(com.sun.jna.Structure.class.isAssignableFrom(structField.type) || java.lang.String.class.isAssignableFrom(structField.type) || com.sun.jna.WString.class.isAssignableFrom(structField.type))) {
            return super.readField(structField);
        }
        return null;
    }

    @Override // com.sun.jna.Structure
    protected int getNativeAlignment(java.lang.Class<?> cls, java.lang.Object obj, boolean z) {
        return super.getNativeAlignment(cls, obj, true);
    }
}
