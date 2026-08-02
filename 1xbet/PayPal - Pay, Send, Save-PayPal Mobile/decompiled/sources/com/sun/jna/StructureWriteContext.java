package com.sun.jna;

/* loaded from: classes5.dex */
public class StructureWriteContext extends com.sun.jna.ToNativeContext {
    private com.sun.jna.Structure Camera2StreamConfigurationMap;
    private java.lang.reflect.Field getHighSpeedVideoFpsRanges;

    StructureWriteContext(com.sun.jna.Structure structure, java.lang.reflect.Field field) {
        this.Camera2StreamConfigurationMap = structure;
        this.getHighSpeedVideoFpsRanges = field;
    }

    public com.sun.jna.Structure getStructure() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.reflect.Field getField() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
