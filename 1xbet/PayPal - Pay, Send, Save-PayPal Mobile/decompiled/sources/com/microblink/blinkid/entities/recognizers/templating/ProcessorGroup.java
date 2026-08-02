package com.microblink.blinkid.entities.recognizers.templating;

/* loaded from: classes10.dex */
public final class ProcessorGroup implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup>() { // from class: com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[i];
        }
    };
    private final com.microblink.blinkid.entities.processors.Processor[] Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;

    public ProcessorGroup(com.microblink.blinkid.geometry.Rectangle rectangle, com.microblink.blinkid.entities.recognizers.templating.DewarpPolicy dewarpPolicy, com.microblink.blinkid.entities.processors.Processor... processorArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        if (rectangle == null) {
            throw new java.lang.NullPointerException("Processing location cannot be null");
        }
        if (processorArr == null || processorArr.length == 0) {
            throw new java.lang.NullPointerException("Processors cannot be null nor empty!");
        }
        if (dewarpPolicy == null) {
            throw new java.lang.NullPointerException("Dewarp policy cannot be null");
        }
        for (com.microblink.blinkid.entities.processors.Processor processor : processorArr) {
            if (processor == null) {
                throw new java.lang.NullPointerException("It is not allowed to pass null processor to ProcessorGroup");
            }
        }
        this.Camera2StreamConfigurationMap = processorArr;
        long[] jArr = new long[processorArr.length];
        for (int i = 0; i < processorArr.length; i++) {
            jArr[i] = processorArr[i].getNativeContext();
        }
        long nativeConstruct = nativeConstruct(jArr);
        this.getHighResolutionOutputSizeshNQ4ISI = nativeConstruct;
        processingLocationNativeSet(nativeConstruct, rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
        dewarpPolicy.llIIlIlIIl(nativeConstruct);
    }

    private static native long nativeConstruct(long[] jArr);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native void processingLocationNativeSet(long j, float f, float f2, float f3, float f4);

    public final void consumeResultFrom(com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup processorGroup) {
        if (this == processorGroup) {
            return;
        }
        if (processorGroup.Camera2StreamConfigurationMap.length != this.Camera2StreamConfigurationMap.length) {
            throw new java.lang.IllegalStateException("Consuming result from incompatible ProcessorGroup");
        }
        int i = 0;
        while (true) {
            com.microblink.blinkid.entities.processors.Processor[] processorArr = this.Camera2StreamConfigurationMap;
            if (i >= processorArr.length) {
                return;
            }
            processorArr[i].consumeResultFrom(processorGroup.Camera2StreamConfigurationMap[i]);
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    protected final void finalize() {
        super.finalize();
        nativeDestruct(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final com.microblink.blinkid.entities.processors.Processor[] getProcessors() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelableArray(this.Camera2StreamConfigurationMap, i);
        byte[] nativeSerialize = nativeSerialize(this.getHighResolutionOutputSizeshNQ4ISI);
        parcel.writeInt(nativeSerialize.length);
        parcel.writeByteArray(nativeSerialize);
    }

    ProcessorGroup(android.os.Parcel parcel) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.microblink.blinkid.entities.processors.Processor.class.getClassLoader());
        this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.processors.Processor[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            this.Camera2StreamConfigurationMap[i] = (com.microblink.blinkid.entities.processors.Processor) readParcelableArray[i];
        }
        com.microblink.blinkid.entities.processors.Processor[] processorArr = this.Camera2StreamConfigurationMap;
        long[] jArr = new long[processorArr.length];
        for (int i2 = 0; i2 < processorArr.length; i2++) {
            jArr[i2] = processorArr[i2].getNativeContext();
        }
        long nativeConstruct = nativeConstruct(jArr);
        this.getHighResolutionOutputSizeshNQ4ISI = nativeConstruct;
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        nativeDeserialize(nativeConstruct, bArr);
    }
}
