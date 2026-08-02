package com.sun.jna;

/* loaded from: classes5.dex */
public class StructureReadContext extends com.sun.jna.FromNativeContext {
    private java.lang.reflect.Field Camera2StreamConfigurationMap;
    private com.sun.jna.Structure getHighSpeedVideoSizes;

    StructureReadContext(com.sun.jna.Structure structure, java.lang.reflect.Field field) {
        super(field.getType());
        this.getHighSpeedVideoSizes = structure;
        this.Camera2StreamConfigurationMap = field;
    }

    public com.sun.jna.Structure getStructure() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.reflect.Field getField() {
        return this.Camera2StreamConfigurationMap;
    }
}
