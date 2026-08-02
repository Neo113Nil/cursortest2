package com.microblink.blinkid.entities.recognizers.templating.parcelization;

/* loaded from: classes10.dex */
public class ProcessorParcelization implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.templating.parcelization.ProcessorParcelization> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.templating.parcelization.ProcessorParcelization>() { // from class: com.microblink.blinkid.entities.recognizers.templating.parcelization.ProcessorParcelization.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.templating.parcelization.ProcessorParcelization createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.templating.parcelization.ProcessorParcelization(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.templating.parcelization.ProcessorParcelization[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.templating.parcelization.ProcessorParcelization[i];
        }
    };
    int Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    public ProcessorParcelization(com.microblink.blinkid.entities.processors.Processor processor, com.microblink.blinkid.entities.recognizers.templating.TemplatingClass templatingClass) {
        this.getHighSpeedVideoSizes = -1;
        this.Camera2StreamConfigurationMap = -1;
        if (getHighSpeedVideoSizes(processor, templatingClass.getClassificationProcessorGroups())) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        } else {
            if (!getHighSpeedVideoSizes(processor, templatingClass.getNonClassificationProcessorGroups())) {
                throw new java.lang.IllegalStateException("Unable to find processor within any processor group within given templating class!");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        }
    }

    private boolean getHighSpeedVideoSizes(com.microblink.blinkid.entities.processors.Processor processor, com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr) {
        if (processorGroupArr == null) {
            return false;
        }
        for (int i = 0; i < processorGroupArr.length; i++) {
            com.microblink.blinkid.entities.processors.Processor[] processors = processorGroupArr[i].getProcessors();
            for (int i2 = 0; i2 < processors.length; i2++) {
                if (processor == processors[i2]) {
                    this.getHighSpeedVideoSizes = i;
                    this.Camera2StreamConfigurationMap = i2;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final <T extends com.microblink.blinkid.entities.processors.Processor> T getProcessor(com.microblink.blinkid.entities.recognizers.templating.TemplatingClass templatingClass) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] classificationProcessorGroups = templatingClass.getClassificationProcessorGroups();
            if (classificationProcessorGroups != null) {
                return (T) classificationProcessorGroups[this.getHighSpeedVideoSizes].getProcessors()[this.Camera2StreamConfigurationMap];
            }
            throw new java.lang.IllegalArgumentException("This ProcessorParcelization is not compatible with given TemplatingClass");
        }
        com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] nonClassificationProcessorGroups = templatingClass.getNonClassificationProcessorGroups();
        if (nonClassificationProcessorGroups != null) {
            return (T) nonClassificationProcessorGroups[this.getHighSpeedVideoSizes].getProcessors()[this.Camera2StreamConfigurationMap];
        }
        throw new java.lang.IllegalArgumentException("This ProcessorParcelization is not compatible with given TemplatingClass");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByte(this.getHighResolutionOutputSizeshNQ4ISI ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.getHighSpeedVideoSizes);
        parcel.writeInt(this.Camera2StreamConfigurationMap);
    }

    ProcessorParcelization() {
        this.getHighSpeedVideoSizes = -1;
        this.Camera2StreamConfigurationMap = -1;
    }

    ProcessorParcelization(android.os.Parcel parcel) {
        this.getHighSpeedVideoSizes = -1;
        this.Camera2StreamConfigurationMap = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readByte() == 1;
        this.getHighSpeedVideoSizes = parcel.readInt();
        this.Camera2StreamConfigurationMap = parcel.readInt();
    }
}
