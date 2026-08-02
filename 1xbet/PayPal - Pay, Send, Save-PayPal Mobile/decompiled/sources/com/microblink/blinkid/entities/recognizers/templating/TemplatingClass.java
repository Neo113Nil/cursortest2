package com.microblink.blinkid.entities.recognizers.templating;

/* loaded from: classes10.dex */
public final class TemplatingClass implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.templating.TemplatingClass> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.templating.TemplatingClass>() { // from class: com.microblink.blinkid.entities.recognizers.templating.TemplatingClass.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.templating.TemplatingClass createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.templating.TemplatingClass(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.templating.TemplatingClass[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.templating.TemplatingClass[i];
        }
    };
    final long Camera2StreamConfigurationMap;
    private com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] getHighSpeedVideoFpsRanges;
    com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.entities.recognizers.templating.TemplatingClass.NativeCallback getHighSpeedVideoSizes;

    public static final class NativeCallback {
        private final com.microblink.blinkid.entities.recognizers.templating.TemplatingClass Camera2StreamConfigurationMap;
        private final com.microblink.blinkid.entities.recognizers.templating.TemplatingClassifier getHighSpeedVideoSizes;

        NativeCallback(com.microblink.blinkid.entities.recognizers.templating.TemplatingClassifier templatingClassifier, com.microblink.blinkid.entities.recognizers.templating.TemplatingClass templatingClass) {
            this.getHighSpeedVideoSizes = templatingClassifier;
            this.Camera2StreamConfigurationMap = templatingClass;
        }
    }

    public TemplatingClass() {
        this.Camera2StreamConfigurationMap = nativeConstruct();
    }

    private static long[] Camera2StreamConfigurationMap(com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr) {
        if (processorGroupArr == null) {
            return null;
        }
        long[] jArr = new long[processorGroupArr.length];
        for (int i = 0; i < processorGroupArr.length; i++) {
            jArr[i] = processorGroupArr[i].getHighResolutionOutputSizeshNQ4ISI;
        }
        return jArr;
    }

    private static native void classificationProcessorGroupsNativeSet(long j, long[] jArr);

    private static native void classifierNativeSet(long j, com.microblink.blinkid.entities.recognizers.templating.TemplatingClass.NativeCallback nativeCallback);

    private static native long nativeConstruct();

    private static native void nativeDestruct(long j);

    private static native void nonClassificationProcessorGroupsNativeSet(long j, long[] jArr);

    public final void consumeResultFrom(com.microblink.blinkid.entities.recognizers.templating.TemplatingClass templatingClass) {
        com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr;
        com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr2;
        if (this == templatingClass) {
            return;
        }
        com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = 0;
        if (processorGroupArr3 == null || (processorGroupArr2 = templatingClass.getHighResolutionOutputSizeshNQ4ISI) == null) {
            if (processorGroupArr3 != null || templatingClass.getHighResolutionOutputSizeshNQ4ISI != null) {
                throw new java.lang.IllegalStateException("Consuming result from incompatible TemplatingClass");
            }
        } else {
            if (processorGroupArr3.length != processorGroupArr2.length) {
                throw new java.lang.IllegalStateException("Consuming result from incompatible TemplatingClass");
            }
            int i2 = 0;
            while (true) {
                com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i2 >= processorGroupArr4.length) {
                    break;
                }
                processorGroupArr4[i2].consumeResultFrom(templatingClass.getHighResolutionOutputSizeshNQ4ISI[i2]);
                i2++;
            }
        }
        com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr5 = this.getHighSpeedVideoFpsRanges;
        if (processorGroupArr5 == null || (processorGroupArr = templatingClass.getHighSpeedVideoFpsRanges) == null) {
            if (processorGroupArr5 != null || templatingClass.getHighSpeedVideoFpsRanges != null) {
                throw new java.lang.IllegalStateException("Consuming result from incompatible TemplatingClass");
            }
        } else {
            if (processorGroupArr5.length != processorGroupArr.length) {
                throw new java.lang.IllegalStateException("Consuming result from incompatible TemplatingClass");
            }
            while (true) {
                com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr6 = this.getHighSpeedVideoFpsRanges;
                if (i >= processorGroupArr6.length) {
                    return;
                }
                processorGroupArr6[i].consumeResultFrom(templatingClass.getHighSpeedVideoFpsRanges[i]);
                i++;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    protected final void finalize() {
        super.finalize();
        nativeDestruct(this.Camera2StreamConfigurationMap);
    }

    public final com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] getClassificationProcessorGroups() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] getNonClassificationProcessorGroups() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final <T extends com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer> T getOwningRecognizer() {
        return (T) this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setClassificationProcessorGroups(com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup... processorGroupArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = processorGroupArr;
        classificationProcessorGroupsNativeSet(this.Camera2StreamConfigurationMap, Camera2StreamConfigurationMap(processorGroupArr));
    }

    public final void setNonClassificationProcessorGroups(com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup... processorGroupArr) {
        this.getHighSpeedVideoFpsRanges = processorGroupArr;
        nonClassificationProcessorGroupsNativeSet(this.Camera2StreamConfigurationMap, Camera2StreamConfigurationMap(processorGroupArr));
    }

    public final void setTemplatingClassifier(com.microblink.blinkid.entities.recognizers.templating.TemplatingClassifier templatingClassifier) {
        if (templatingClassifier == null) {
            this.getHighSpeedVideoSizes = null;
        } else {
            this.getHighSpeedVideoSizes = new com.microblink.blinkid.entities.recognizers.templating.TemplatingClass.NativeCallback(templatingClassifier, this);
        }
        classifierNativeSet(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.microblink.blinkid.entities.recognizers.templating.TemplatingClass.NativeCallback nativeCallback = this.getHighSpeedVideoSizes;
        if (nativeCallback != null) {
            parcel.writeParcelable(nativeCallback.getHighSpeedVideoSizes, i);
        } else {
            parcel.writeParcelable(null, i);
        }
        com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (processorGroupArr != null) {
            parcel.writeInt(processorGroupArr.length);
            parcel.writeTypedArray(this.getHighResolutionOutputSizeshNQ4ISI, i);
        } else {
            parcel.writeInt(-1);
        }
        com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr2 = this.getHighSpeedVideoFpsRanges;
        if (processorGroupArr2 == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(processorGroupArr2.length);
            parcel.writeTypedArray(this.getHighSpeedVideoFpsRanges, i);
        }
    }

    TemplatingClass(android.os.Parcel parcel) {
        long nativeConstruct = nativeConstruct();
        this.Camera2StreamConfigurationMap = nativeConstruct;
        setTemplatingClassifier((com.microblink.blinkid.entities.recognizers.templating.TemplatingClassifier) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.templating.TemplatingClassifier.class.getClassLoader()));
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr = new com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[readInt];
            this.getHighResolutionOutputSizeshNQ4ISI = processorGroupArr;
            parcel.readTypedArray(processorGroupArr, com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup.CREATOR);
            classificationProcessorGroupsNativeSet(nativeConstruct, Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        int readInt2 = parcel.readInt();
        if (readInt2 >= 0) {
            com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr2 = new com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[readInt2];
            this.getHighSpeedVideoFpsRanges = processorGroupArr2;
            parcel.readTypedArray(processorGroupArr2, com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup.CREATOR);
            nonClassificationProcessorGroupsNativeSet(nativeConstruct, Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges));
        }
    }
}
