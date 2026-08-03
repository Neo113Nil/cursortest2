package io.appmetrica.analytics.protobuf.nano;

/* loaded from: classes.dex */
public final class MapFactories {
    private static volatile io.appmetrica.analytics.protobuf.nano.MapFactories.MapFactory mapFactory = new io.appmetrica.analytics.protobuf.nano.MapFactories.DefaultMapFactory();

    public static class DefaultMapFactory implements io.appmetrica.analytics.protobuf.nano.MapFactories.MapFactory {
        private DefaultMapFactory() {
        }

        @Override // io.appmetrica.analytics.protobuf.nano.MapFactories.MapFactory
        public <K, V> java.util.Map<K, V> forMap(java.util.Map<K, V> map) {
            return map == null ? new java.util.HashMap() : map;
        }
    }

    public interface MapFactory {
        <K, V> java.util.Map<K, V> forMap(java.util.Map<K, V> map);
    }

    private MapFactories() {
    }

    public static io.appmetrica.analytics.protobuf.nano.MapFactories.MapFactory getMapFactory() {
        return mapFactory;
    }

    public static void setMapFactory(io.appmetrica.analytics.protobuf.nano.MapFactories.MapFactory mapFactory2) {
        mapFactory = mapFactory2;
    }
}
