package com.microblink.blinkid.entities.recognizers.templating;

/* loaded from: classes10.dex */
public abstract class TemplatingRecognizer<R extends com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer.Result> extends com.microblink.blinkid.entities.recognizers.Recognizer<R> implements com.microblink.blinkid.entities.settings.GlareDetectorOptions {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer";
    private com.microblink.blinkid.entities.recognizers.templating.TemplatingClass[] getHighResolutionOutputSizeshNQ4ISI;

    public static abstract class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result {
        public Result(long j) {
            super(j);
        }

        protected abstract int IlIllIlIIl(long j);

        public final com.microblink.blinkid.entities.recognizers.templating.TemplatingClass getTemplatingClass() {
            com.microblink.blinkid.entities.Entity entity = this.IlIllIlIIl;
            if (entity == null || !(entity instanceof com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer)) {
                return null;
            }
            com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer templatingRecognizer = (com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer) entity;
            int IlIllIlIIl = IlIllIlIIl(templatingRecognizer.getNativeContext());
            if (IlIllIlIIl >= 0) {
                return templatingRecognizer.getHighResolutionOutputSizeshNQ4ISI[IlIllIlIIl];
            }
            return null;
        }

        protected abstract void llIIlIlIIl(long j, int i);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(android.os.Parcel parcel) {
            com.microblink.blinkid.entities.Entity entity;
            int readInt = parcel.readInt();
            if (readInt >= 0 && (entity = this.IlIllIlIIl) != null && (entity instanceof com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer)) {
                llIIlIlIIl(((com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer) entity).getNativeContext(), readInt);
            }
            super.llIIlIlIIl(parcel);
        }

        @Override // com.microblink.blinkid.entities.Entity.Result, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            com.microblink.blinkid.entities.Entity entity = this.IlIllIlIIl;
            if (entity == null || !(entity instanceof com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer)) {
                parcel.writeInt(-1);
            } else {
                parcel.writeInt(IlIllIlIIl(((com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer) entity).getNativeContext()));
            }
            super.writeToParcel(parcel, i);
        }
    }

    public TemplatingRecognizer(long j, com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer.Result result) {
        super(j, result);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        com.microblink.blinkid.entities.recognizers.templating.TemplatingClass[] templatingClassArr;
        if (this == entity) {
            return;
        }
        if (!(entity instanceof com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer)) {
            throw new java.lang.IllegalArgumentException("Parameter type has to be TemplatingRecognizer");
        }
        com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer templatingRecognizer = (com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer) entity;
        com.microblink.blinkid.entities.recognizers.templating.TemplatingClass[] templatingClassArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (templatingClassArr2 == null || (templatingClassArr = templatingRecognizer.getHighResolutionOutputSizeshNQ4ISI) == null) {
            if (templatingClassArr2 != null || templatingRecognizer.getHighResolutionOutputSizeshNQ4ISI != null) {
                throw new java.lang.IllegalStateException("Consuming result from incompatible Templating recognizer");
            }
        } else {
            if (templatingClassArr2.length != templatingClassArr.length) {
                throw new java.lang.IllegalStateException("Consuming result from incompatible Templating recognizer");
            }
            int i = 0;
            while (true) {
                com.microblink.blinkid.entities.recognizers.templating.TemplatingClass[] templatingClassArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i >= templatingClassArr3.length) {
                    return;
                }
                templatingClassArr3[i].consumeResultFrom(templatingRecognizer.getHighResolutionOutputSizeshNQ4ISI[i]);
                i++;
            }
        }
    }

    protected abstract void llIIlIlIIl(long[] jArr);

    public final void setTemplatingClasses(com.microblink.blinkid.entities.recognizers.templating.TemplatingClass... templatingClassArr) {
        long[] jArr;
        this.getHighResolutionOutputSizeshNQ4ISI = templatingClassArr;
        if (templatingClassArr == null) {
            jArr = null;
        } else {
            long[] jArr2 = new long[templatingClassArr.length];
            for (int i = 0; i < templatingClassArr.length; i++) {
                jArr2[i] = templatingClassArr[i].Camera2StreamConfigurationMap;
            }
            jArr = jArr2;
        }
        llIIlIlIIl(jArr);
        com.microblink.blinkid.entities.recognizers.templating.TemplatingClass[] templatingClassArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (templatingClassArr2 != null) {
            for (com.microblink.blinkid.entities.recognizers.templating.TemplatingClass templatingClass : templatingClassArr2) {
                templatingClass.getHighSpeedVideoFpsRangesFor = this;
            }
        }
    }

    @Override // com.microblink.blinkid.entities.Entity, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.microblink.blinkid.entities.recognizers.templating.TemplatingClass[] templatingClassArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (templatingClassArr != null) {
            parcel.writeInt(templatingClassArr.length);
            parcel.writeTypedArray(this.getHighResolutionOutputSizeshNQ4ISI, i);
        } else {
            parcel.writeInt(-1);
        }
        super.writeToParcel(parcel, i);
    }

    public TemplatingRecognizer(long j, com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer.Result result, android.os.Parcel parcel) {
        super(j, result, parcel);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public void llIIlIlIIl(android.os.Parcel parcel) {
        long[] jArr;
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            com.microblink.blinkid.entities.recognizers.templating.TemplatingClass[] templatingClassArr = new com.microblink.blinkid.entities.recognizers.templating.TemplatingClass[readInt];
            this.getHighResolutionOutputSizeshNQ4ISI = templatingClassArr;
            parcel.readTypedArray(templatingClassArr, com.microblink.blinkid.entities.recognizers.templating.TemplatingClass.CREATOR);
            com.microblink.blinkid.entities.recognizers.templating.TemplatingClass[] templatingClassArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (templatingClassArr2 == null) {
                jArr = null;
            } else {
                long[] jArr2 = new long[templatingClassArr2.length];
                for (int i = 0; i < templatingClassArr2.length; i++) {
                    jArr2[i] = templatingClassArr2[i].Camera2StreamConfigurationMap;
                }
                jArr = jArr2;
            }
            llIIlIlIIl(jArr);
            com.microblink.blinkid.entities.recognizers.templating.TemplatingClass[] templatingClassArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (templatingClassArr3 != null) {
                for (com.microblink.blinkid.entities.recognizers.templating.TemplatingClass templatingClass : templatingClassArr3) {
                    templatingClass.getHighSpeedVideoFpsRangesFor = this;
                }
            }
        }
        super.llIIlIlIIl(parcel);
    }
}
