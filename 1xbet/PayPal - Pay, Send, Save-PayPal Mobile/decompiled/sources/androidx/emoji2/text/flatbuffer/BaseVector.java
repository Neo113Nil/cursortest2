package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public class BaseVector {
    private int Camera2StreamConfigurationMap;
    protected java.nio.ByteBuffer bb;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    protected int __vector() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    protected int __element(int i) {
        return this.getHighSpeedVideoFpsRangesFor + (i * this.getHighSpeedVideoSizes);
    }

    protected void __reset(int i, int i2, java.nio.ByteBuffer byteBuffer) {
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.Camera2StreamConfigurationMap = byteBuffer.getInt(i - 4);
            this.getHighSpeedVideoSizes = i2;
        } else {
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoSizes = 0;
        }
    }

    public void reset() {
        __reset(0, 0, null);
    }

    public int length() {
        return this.Camera2StreamConfigurationMap;
    }
}
