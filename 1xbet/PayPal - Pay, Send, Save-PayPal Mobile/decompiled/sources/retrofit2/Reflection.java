package retrofit2;

/* loaded from: classes5.dex */
class Reflection {
    boolean Camera2StreamConfigurationMap(java.lang.reflect.Method method) {
        return false;
    }

    Reflection() {
    }

    @javax.annotation.Nullable
    java.lang.Object getHighSpeedVideoSizes(java.lang.reflect.Method method, java.lang.Class<?> cls, java.lang.Object obj, @javax.annotation.Nullable java.lang.Object[] objArr) throws java.lang.Throwable {
        throw new java.lang.AssertionError();
    }

    java.lang.String Camera2StreamConfigurationMap(java.lang.reflect.Method method, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("parameter #");
        sb.append(i + 1);
        return sb.toString();
    }

    static class Java8 extends retrofit2.Reflection {
        Java8() {
        }

        @Override // retrofit2.Reflection
        final boolean Camera2StreamConfigurationMap(java.lang.reflect.Method method) {
            return method.isDefault();
        }

        @Override // retrofit2.Reflection
        final java.lang.Object getHighSpeedVideoSizes(java.lang.reflect.Method method, java.lang.Class<?> cls, java.lang.Object obj, @javax.annotation.Nullable java.lang.Object[] objArr) throws java.lang.Throwable {
            return retrofit2.DefaultMethodSupport.getHighSpeedVideoFpsRangesFor(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        final java.lang.String Camera2StreamConfigurationMap(java.lang.reflect.Method method, int i) {
            java.lang.reflect.Parameter parameter = method.getParameters()[i];
            if (parameter.isNamePresent()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("parameter '");
                sb.append(parameter.getName());
                sb.append('\'');
                return sb.toString();
            }
            return super.Camera2StreamConfigurationMap(method, i);
        }
    }

    static final class Android24 extends retrofit2.Reflection {
        Android24() {
        }

        @Override // retrofit2.Reflection
        final boolean Camera2StreamConfigurationMap(java.lang.reflect.Method method) {
            return method.isDefault();
        }

        @Override // retrofit2.Reflection
        final java.lang.Object getHighSpeedVideoSizes(java.lang.reflect.Method method, java.lang.Class<?> cls, java.lang.Object obj, @javax.annotation.Nullable java.lang.Object[] objArr) throws java.lang.Throwable {
            return retrofit2.DefaultMethodSupport.getHighSpeedVideoFpsRangesFor(method, cls, obj, objArr);
        }
    }
}
