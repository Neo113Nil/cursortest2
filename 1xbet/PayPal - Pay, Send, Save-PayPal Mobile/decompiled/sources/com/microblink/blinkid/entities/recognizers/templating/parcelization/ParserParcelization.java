package com.microblink.blinkid.entities.recognizers.templating.parcelization;

/* loaded from: classes10.dex */
public final class ParserParcelization extends com.microblink.blinkid.entities.recognizers.templating.parcelization.ProcessorParcelization {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.templating.parcelization.ParserParcelization> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.templating.parcelization.ParserParcelization>() { // from class: com.microblink.blinkid.entities.recognizers.templating.parcelization.ParserParcelization.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.templating.parcelization.ParserParcelization createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.templating.parcelization.ParserParcelization(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.templating.parcelization.ParserParcelization[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.templating.parcelization.ParserParcelization[i];
        }
    };
    private int getHighSpeedVideoFpsRanges;

    public ParserParcelization(com.microblink.blinkid.entities.parsers.Parser parser, com.microblink.blinkid.entities.recognizers.templating.TemplatingClass templatingClass) {
        this.getHighSpeedVideoFpsRanges = -1;
        if (getHighSpeedVideoFpsRangesFor(parser, templatingClass.getClassificationProcessorGroups())) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        } else {
            if (!getHighSpeedVideoFpsRangesFor(parser, templatingClass.getNonClassificationProcessorGroups())) {
                throw new java.lang.IllegalStateException("Unable to find parser within any parser group processor within any processor group within given templating class!");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        }
    }

    private boolean getHighSpeedVideoFpsRangesFor(com.microblink.blinkid.entities.parsers.Parser parser, com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] processorGroupArr) {
        if (processorGroupArr == null) {
            return false;
        }
        for (int i = 0; i < processorGroupArr.length; i++) {
            com.microblink.blinkid.entities.processors.Processor[] processors = processorGroupArr[i].getProcessors();
            for (int i2 = 0; i2 < processors.length; i2++) {
                com.microblink.blinkid.entities.processors.Processor processor = processors[i2];
                if (processor instanceof com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor) {
                    com.microblink.blinkid.entities.parsers.Parser[] parsers = ((com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor) processor).getParsers();
                    for (int i3 = 0; i3 < parsers.length; i3++) {
                        if (parser == parsers[i3]) {
                            this.getHighSpeedVideoSizes = i;
                            this.Camera2StreamConfigurationMap = i2;
                            this.getHighSpeedVideoFpsRanges = i3;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final <T extends com.microblink.blinkid.entities.parsers.Parser> T getParser(com.microblink.blinkid.entities.recognizers.templating.TemplatingClass templatingClass) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] classificationProcessorGroups = templatingClass.getClassificationProcessorGroups();
            if (classificationProcessorGroups == null) {
                throw new java.lang.IllegalArgumentException("This ParserParcelization is not compatible with given TemplatingClass");
            }
            com.microblink.blinkid.entities.processors.Processor processor = classificationProcessorGroups[this.getHighSpeedVideoSizes].getProcessors()[this.Camera2StreamConfigurationMap];
            if (processor instanceof com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor) {
                return (T) ((com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor) processor).getParsers()[this.getHighSpeedVideoFpsRanges];
            }
            throw new java.lang.IllegalArgumentException("This ParserParcelization is not compatible with given TemplatingClass");
        }
        com.microblink.blinkid.entities.recognizers.templating.ProcessorGroup[] nonClassificationProcessorGroups = templatingClass.getNonClassificationProcessorGroups();
        if (nonClassificationProcessorGroups == null) {
            throw new java.lang.IllegalArgumentException("This ParserParcelization is not compatible with given TemplatingClass");
        }
        com.microblink.blinkid.entities.processors.Processor processor2 = nonClassificationProcessorGroups[this.getHighSpeedVideoSizes].getProcessors()[this.Camera2StreamConfigurationMap];
        if (processor2 instanceof com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor) {
            return (T) ((com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor) processor2).getParsers()[this.getHighSpeedVideoFpsRanges];
        }
        throw new java.lang.IllegalArgumentException("This ParserParcelization is not compatible with given TemplatingClass");
    }

    @Override // com.microblink.blinkid.entities.recognizers.templating.parcelization.ProcessorParcelization, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.getHighSpeedVideoFpsRanges);
    }

    ParserParcelization(android.os.Parcel parcel) {
        super(parcel);
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoFpsRanges = parcel.readInt();
    }
}
