package com.yandex.varioqub.protobuf.nano;

/* loaded from: classes.dex */
public final class MapFactories {
    private static volatile com.yandex.varioqub.protobuf.nano.MapFactories.MapFactory mapFactory = new com.yandex.varioqub.protobuf.nano.MapFactories.DefaultMapFactory();

    public static class DefaultMapFactory implements com.yandex.varioqub.protobuf.nano.MapFactories.MapFactory {
        private DefaultMapFactory() {
        }

        @Override // com.yandex.varioqub.protobuf.nano.MapFactories.MapFactory
        public <K, V> java.util.Map<K, V> forMap(java.util.Map<K, V> map) {
            return map == null ? new java.util.HashMap() : map;
        }
    }

    public interface MapFactory {
        <K, V> java.util.Map<K, V> forMap(java.util.Map<K, V> map);
    }

    private MapFactories() {
    }

    public static com.yandex.varioqub.protobuf.nano.MapFactories.MapFactory getMapFactory() {
        return mapFactory;
    }

    public static void setMapFactory(com.yandex.varioqub.protobuf.nano.MapFactories.MapFactory mapFactory2) {
        mapFactory = mapFactory2;
    }
}
