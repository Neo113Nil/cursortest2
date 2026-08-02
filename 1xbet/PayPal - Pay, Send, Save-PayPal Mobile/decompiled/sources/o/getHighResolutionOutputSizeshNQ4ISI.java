package o;

/* loaded from: classes4.dex */
public final class getHighResolutionOutputSizeshNQ4ISI {
    public static com.google.gson.TypeAdapter getHighSpeedVideoSizes(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken typeToken, java.lang.Object obj) {
        java.lang.reflect.Type type = typeToken.getType();
        java.lang.reflect.Type type2 = (obj == null || !(type == java.lang.Object.class || (type instanceof java.lang.reflect.TypeVariable) || (type instanceof java.lang.Class))) ? type : obj.getClass();
        com.google.gson.TypeAdapter adapter = gson.getAdapter(com.google.gson.reflect.TypeToken.get(type2));
        if (type != type2 && ((adapter instanceof o.getHighSpeedVideoSizesFor) || (adapter instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter))) {
            com.google.gson.TypeAdapter adapter2 = gson.getAdapter(typeToken);
            if (!(adapter2 instanceof o.getHighSpeedVideoSizesFor) && !(adapter2 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter)) {
                return adapter2;
            }
        }
        return adapter;
    }

    public static com.google.gson.TypeAdapter getHighSpeedVideoFpsRanges(com.google.gson.Gson gson, java.lang.Class cls, java.lang.Object obj) {
        java.lang.Class cls2 = (obj == null || !(cls == java.lang.Object.class || (cls instanceof java.lang.Class))) ? cls : obj.getClass();
        com.google.gson.TypeAdapter adapter = gson.getAdapter(com.google.gson.reflect.TypeToken.get((java.lang.reflect.Type) cls2));
        if (cls != cls2 && ((adapter instanceof o.getHighSpeedVideoSizesFor) || (adapter instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter))) {
            com.google.gson.TypeAdapter adapter2 = gson.getAdapter(cls);
            if (!(adapter2 instanceof o.getHighSpeedVideoSizesFor) && !(adapter2 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter)) {
                return adapter2;
            }
        }
        return adapter;
    }
}
