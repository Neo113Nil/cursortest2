package com.sun.jna;

/* loaded from: classes5.dex */
abstract class VarArgsChecker {
    abstract boolean Camera2StreamConfigurationMap(java.lang.reflect.Method method);

    abstract int getHighSpeedVideoSizes(java.lang.reflect.Method method);

    /* synthetic */ VarArgsChecker(byte b) {
        this();
    }

    private VarArgsChecker() {
    }

    static final class RealVarArgsChecker extends com.sun.jna.VarArgsChecker {
        private RealVarArgsChecker() {
            super((byte) 0);
        }

        /* synthetic */ RealVarArgsChecker(byte b) {
            this();
        }

        @Override // com.sun.jna.VarArgsChecker
        final boolean Camera2StreamConfigurationMap(java.lang.reflect.Method method) {
            return method.isVarArgs();
        }

        @Override // com.sun.jna.VarArgsChecker
        final int getHighSpeedVideoSizes(java.lang.reflect.Method method) {
            if (method.isVarArgs()) {
                return method.getParameterTypes().length - 1;
            }
            return 0;
        }
    }

    static final class NoVarArgsChecker extends com.sun.jna.VarArgsChecker {
        @Override // com.sun.jna.VarArgsChecker
        final boolean Camera2StreamConfigurationMap(java.lang.reflect.Method method) {
            return false;
        }

        @Override // com.sun.jna.VarArgsChecker
        final int getHighSpeedVideoSizes(java.lang.reflect.Method method) {
            return 0;
        }

        private NoVarArgsChecker() {
            super((byte) 0);
        }

        /* synthetic */ NoVarArgsChecker(byte b) {
            this();
        }
    }

    static com.sun.jna.VarArgsChecker Camera2StreamConfigurationMap() {
        byte b = 0;
        try {
            if (java.lang.reflect.Method.class.getMethod("isVarArgs", new java.lang.Class[0]) != null) {
                return new com.sun.jna.VarArgsChecker.RealVarArgsChecker(b);
            }
            return new com.sun.jna.VarArgsChecker.NoVarArgsChecker(b);
        } catch (java.lang.NoSuchMethodException | java.lang.SecurityException unused) {
            return new com.sun.jna.VarArgsChecker.NoVarArgsChecker(b);
        }
    }
}
