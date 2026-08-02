package com.microblink.blinkid.intent;

/* loaded from: classes10.dex */
public abstract class BaseIntentTransferable<T extends com.microblink.blinkid.intent.BaseIntentTransferable<T>> implements com.microblink.blinkid.intent.MBIntentTransferable {
    private java.lang.String Camera2StreamConfigurationMap;

    protected abstract java.lang.String IlIllIlIIl();

    @Override // com.microblink.blinkid.intent.MBIntentTransferable
    public void clearSavedState() {
        com.microblink.blinkid.intent.IntentDataTransferMode intentDataTransferMode;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        if (str == null || (intentDataTransferMode = com.microblink.blinkid.MicroblinkSDK.getIntentDataTransferMode()) == com.microblink.blinkid.intent.IntentDataTransferMode.STANDARD) {
            return;
        }
        com.microblink.blinkid.secured.IlIIllIIII llIIlIlIIl = com.microblink.blinkid.secured.IlIIllIIII.llIIlIlIIl();
        android.content.Context applicationContext = com.microblink.blinkid.MicroblinkSDK.getApplicationContext();
        if (applicationContext == null) {
            throw new java.lang.IllegalStateException("Application context has not been passed to the Microblink SDK. Please check whether you have set the license key for the Microblink SDK, where application context also has to be provided.");
        }
        boolean z = intentDataTransferMode == com.microblink.blinkid.intent.IntentDataTransferMode.PERSISTED_OPTIMISED;
        llIIlIlIIl.IlIllIlIIl.remove(str);
        if (z) {
            llIIlIlIIl.llIIlIlIIl.llIIlIlIIl(new com.microblink.blinkid.secured.IllIIlIIIl(llIIlIlIIl, applicationContext, str));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.microblink.blinkid.intent.MBIntentTransferable
    public final boolean existsInIntent(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String stringExtra = intent.getStringExtra(IlIllIlIIl());
        if (stringExtra == null || ((str = this.Camera2StreamConfigurationMap) != null && !stringExtra.equals(str))) {
            stringExtra = null;
        }
        return stringExtra != null;
    }

    protected abstract android.os.Parcelable.Creator llIIlIlIIl();

    public void llIIlIlIIl(android.os.Parcel parcel) {
        this.Camera2StreamConfigurationMap = parcel.readString();
    }

    protected abstract void llIIlIlIIl(com.microblink.blinkid.intent.BaseIntentTransferable baseIntentTransferable);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.intent.MBIntentTransferable
    public final void loadFromIntent(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String stringExtra = intent.getStringExtra(IlIllIlIIl());
        byte[] bArr = null;
        com.microblink.blinkid.intent.MBIntentTransferable mBIntentTransferable = null;
        bArr = null;
        if (stringExtra == null || ((str = this.Camera2StreamConfigurationMap) != null && !stringExtra.equals(str))) {
            stringExtra = null;
        }
        if (stringExtra == null) {
            throw new java.lang.IllegalStateException("Expected intent transferable object does not exist in the intent!");
        }
        android.os.Parcelable.Creator llIIlIlIIl = llIIlIlIIl();
        com.microblink.blinkid.intent.IntentDataTransferMode intentDataTransferMode = com.microblink.blinkid.MicroblinkSDK.getIntentDataTransferMode();
        if (intentDataTransferMode == com.microblink.blinkid.intent.IntentDataTransferMode.STANDARD) {
            byte[] byteArrayExtra = intent.getByteArrayExtra(stringExtra);
            if (byteArrayExtra != null) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                obtain.setDataPosition(0);
                mBIntentTransferable = (com.microblink.blinkid.intent.MBIntentTransferable) llIIlIlIIl.createFromParcel(obtain);
                obtain.recycle();
            }
        } else {
            com.microblink.blinkid.secured.IlIIllIIII llIIlIlIIl2 = com.microblink.blinkid.secured.IlIIllIIII.llIIlIlIIl();
            android.content.Context applicationContext = com.microblink.blinkid.MicroblinkSDK.getApplicationContext();
            if (applicationContext == null) {
                throw new java.lang.IllegalStateException("Application context has not been passed to the Microblink SDK. Please check whether you have set the license key for the Microblink SDK, where application context also has to be provided.");
            }
            java.lang.Object[] objArr = intentDataTransferMode == com.microblink.blinkid.intent.IntentDataTransferMode.PERSISTED_OPTIMISED;
            try {
                com.microblink.blinkid.intent.MBIntentTransferable mBIntentTransferable2 = (com.microblink.blinkid.intent.MBIntentTransferable) llIIlIlIIl2.IlIllIlIIl.get(stringExtra);
                boolean isEmpty = llIIlIlIIl2.IlIllIlIIl.isEmpty();
                llIIlIlIIl2.IlIllIlIIl.remove(stringExtra);
                if (objArr == true) {
                    if (mBIntentTransferable2 == null) {
                        java.io.File file = new java.io.File(applicationContext.getFilesDir(), "microblink_intent_data/".concat(stringExtra));
                        if (file.exists()) {
                            try {
                                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
                                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int read = bufferedInputStream.read(bArr2);
                                    if (read == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr2, 0, read);
                                    }
                                }
                                byteArrayOutputStream.flush();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bufferedInputStream.close();
                                byteArrayOutputStream.close();
                                bArr = byteArray;
                            } catch (java.io.IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (bArr != null) {
                            android.os.Parcel obtain2 = android.os.Parcel.obtain();
                            obtain2.unmarshall(bArr, 0, bArr.length);
                            obtain2.setDataPosition(0);
                            mBIntentTransferable = (com.microblink.blinkid.intent.MBIntentTransferable) llIIlIlIIl.createFromParcel(obtain2);
                            obtain2.recycle();
                            llIIlIlIIl2.llIIlIlIIl.llIIlIlIIl(new com.microblink.blinkid.secured.IlllIIlIIl(llIIlIlIIl2, applicationContext, !isEmpty, stringExtra));
                        }
                    }
                    mBIntentTransferable = mBIntentTransferable2;
                    llIIlIlIIl2.llIIlIlIIl.llIIlIlIIl(new com.microblink.blinkid.secured.IlllIIlIIl(llIIlIlIIl2, applicationContext, !isEmpty, stringExtra));
                } else {
                    mBIntentTransferable = mBIntentTransferable2;
                }
            } catch (java.lang.ClassCastException unused) {
                throw new java.lang.IllegalStateException("Previously stored transferable data is of unexpected type!");
            }
        }
        com.microblink.blinkid.intent.BaseIntentTransferable baseIntentTransferable = (com.microblink.blinkid.intent.BaseIntentTransferable) mBIntentTransferable;
        if (baseIntentTransferable == null) {
            throw new java.lang.IllegalStateException("Intent transferable object cannot be loaded.");
        }
        this.Camera2StreamConfigurationMap = baseIntentTransferable.Camera2StreamConfigurationMap;
        llIIlIlIIl(baseIntentTransferable);
    }

    @Override // com.microblink.blinkid.intent.MBIntentTransferable
    public void saveState() {
        com.microblink.blinkid.intent.IntentDataTransferMode intentDataTransferMode;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        if (str == null || (intentDataTransferMode = com.microblink.blinkid.MicroblinkSDK.getIntentDataTransferMode()) == com.microblink.blinkid.intent.IntentDataTransferMode.STANDARD) {
            return;
        }
        com.microblink.blinkid.secured.IlIIllIIII llIIlIlIIl = com.microblink.blinkid.secured.IlIIllIIII.llIIlIlIIl();
        android.content.Context applicationContext = com.microblink.blinkid.MicroblinkSDK.getApplicationContext();
        if (applicationContext == null) {
            throw new java.lang.IllegalStateException("Application context has not been passed to the Microblink SDK. Please check whether you have set the license key for the Microblink SDK, where application context also has to be provided.");
        }
        boolean z = intentDataTransferMode == com.microblink.blinkid.intent.IntentDataTransferMode.PERSISTED_OPTIMISED;
        llIIlIlIIl.IlIllIlIIl.put(str, this);
        if (z) {
            llIIlIlIIl.llIIlIlIIl.llIIlIlIIl(new com.microblink.blinkid.secured.lIlIIlllII(applicationContext, str, this));
        }
    }

    @Override // com.microblink.blinkid.intent.MBIntentTransferable
    public void saveToIntent(android.content.Intent intent) {
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = java.util.UUID.randomUUID().toString();
        }
        intent.putExtra(IlIllIlIIl(), this.Camera2StreamConfigurationMap);
        java.lang.String str = this.Camera2StreamConfigurationMap;
        com.microblink.blinkid.intent.IntentDataTransferMode intentDataTransferMode = com.microblink.blinkid.MicroblinkSDK.getIntentDataTransferMode();
        if (intentDataTransferMode == com.microblink.blinkid.intent.IntentDataTransferMode.STANDARD) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 65536) {
                throw new java.lang.IllegalStateException("Data cannot be saved to intent because its size exceeds intent limit!");
            }
            intent.putExtra(str, marshall);
            return;
        }
        com.microblink.blinkid.secured.IlIIllIIII llIIlIlIIl = com.microblink.blinkid.secured.IlIIllIIII.llIIlIlIIl();
        android.content.Context applicationContext = com.microblink.blinkid.MicroblinkSDK.getApplicationContext();
        if (applicationContext == null) {
            throw new java.lang.IllegalStateException("Application context has not been passed to the Microblink SDK. Please check whether you have set the license key for the Microblink SDK, where application context also has to be provided.");
        }
        boolean z = intentDataTransferMode == com.microblink.blinkid.intent.IntentDataTransferMode.PERSISTED_OPTIMISED;
        llIIlIlIIl.IlIllIlIIl.put(str, this);
        if (z) {
            llIIlIlIIl.llIIlIlIIl.llIIlIlIIl(new com.microblink.blinkid.secured.lIlIIlllII(applicationContext, str, this));
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.Camera2StreamConfigurationMap);
    }
}
