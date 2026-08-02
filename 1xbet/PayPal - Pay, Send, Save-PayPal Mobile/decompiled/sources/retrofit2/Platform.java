package retrofit2;

/* loaded from: classes5.dex */
final class Platform {
    static final retrofit2.BuiltInFactories Camera2StreamConfigurationMap;

    @javax.annotation.Nullable
    static final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
    static final retrofit2.Reflection getHighSpeedVideoSizes;

    static {
        java.lang.String property = java.lang.System.getProperty("java.vm.name");
        property.hashCode();
        if (property.equals("RoboVM")) {
            getHighResolutionOutputSizeshNQ4ISI = null;
            getHighSpeedVideoSizes = new retrofit2.Reflection();
            Camera2StreamConfigurationMap = new retrofit2.BuiltInFactories();
        } else if (property.equals("Dalvik")) {
            getHighResolutionOutputSizeshNQ4ISI = new retrofit2.AndroidMainExecutor();
            getHighSpeedVideoSizes = new retrofit2.Reflection.Android24();
            Camera2StreamConfigurationMap = new retrofit2.BuiltInFactories.Java8();
        } else {
            getHighResolutionOutputSizeshNQ4ISI = null;
            getHighSpeedVideoSizes = new retrofit2.Reflection.Java8();
            Camera2StreamConfigurationMap = new retrofit2.BuiltInFactories.Java8();
        }
    }

    private Platform() {
    }
}
