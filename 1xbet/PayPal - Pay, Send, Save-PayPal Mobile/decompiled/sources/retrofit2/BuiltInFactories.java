package retrofit2;

/* loaded from: classes5.dex */
class BuiltInFactories {
    BuiltInFactories() {
    }

    java.util.List<? extends retrofit2.CallAdapter.Factory> Camera2StreamConfigurationMap(@javax.annotation.Nullable java.util.concurrent.Executor executor) {
        return java.util.Collections.singletonList(new retrofit2.DefaultCallAdapterFactory(executor));
    }

    java.util.List<? extends retrofit2.Converter.Factory> getHighSpeedVideoSizes() {
        return java.util.Collections.emptyList();
    }

    static final class Java8 extends retrofit2.BuiltInFactories {
        Java8() {
        }

        @Override // retrofit2.BuiltInFactories
        final java.util.List<? extends retrofit2.CallAdapter.Factory> Camera2StreamConfigurationMap(@javax.annotation.Nullable java.util.concurrent.Executor executor) {
            return java.util.Arrays.asList(new retrofit2.CompletableFutureCallAdapterFactory(), new retrofit2.DefaultCallAdapterFactory(executor));
        }

        @Override // retrofit2.BuiltInFactories
        final java.util.List<? extends retrofit2.Converter.Factory> getHighSpeedVideoSizes() {
            return java.util.Collections.singletonList(new retrofit2.OptionalConverterFactory());
        }
    }
}
