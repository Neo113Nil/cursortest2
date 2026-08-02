package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class KeyFrames {
    java.util.ArrayList<androidx.constraintlayout.core.dsl.Keys> Camera2StreamConfigurationMap = new java.util.ArrayList<>();

    public void add(androidx.constraintlayout.core.dsl.Keys keys) {
        this.Camera2StreamConfigurationMap.add(keys);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            sb.append("keyFrames:{\n");
            java.util.Iterator<androidx.constraintlayout.core.dsl.Keys> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
            }
            sb.append("},\n");
        }
        return sb.toString();
    }
}
