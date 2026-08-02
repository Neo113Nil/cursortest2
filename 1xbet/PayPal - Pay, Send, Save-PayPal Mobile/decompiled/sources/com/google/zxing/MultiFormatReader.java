package com.google.zxing;

/* loaded from: classes9.dex */
public final class MultiFormatReader implements com.google.zxing.Reader {
    private static final com.google.zxing.Reader[] EMPTY_READER_ARRAY = new com.google.zxing.Reader[0];
    private java.util.Map<com.google.zxing.DecodeHintType, ?> hints;
    private com.google.zxing.Reader[] readers;

    @Override // com.google.zxing.Reader
    public final com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap) throws com.google.zxing.NotFoundException {
        setHints(null);
        return decodeInternal(binaryBitmap);
    }

    @Override // com.google.zxing.Reader
    public final com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException {
        setHints(map);
        return decodeInternal(binaryBitmap);
    }

    public final com.google.zxing.Result decodeWithState(com.google.zxing.BinaryBitmap binaryBitmap) throws com.google.zxing.NotFoundException {
        if (this.readers == null) {
            setHints(null);
        }
        return decodeInternal(binaryBitmap);
    }

    public final void setHints(java.util.Map<com.google.zxing.DecodeHintType, ?> map) {
        this.hints = map;
        boolean z = map != null && map.containsKey(com.google.zxing.DecodeHintType.TRY_HARDER);
        java.util.Collection collection = map == null ? null : (java.util.Collection) map.get(com.google.zxing.DecodeHintType.POSSIBLE_FORMATS);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (collection != null) {
            boolean z2 = collection.contains(com.google.zxing.BarcodeFormat.UPC_A) || collection.contains(com.google.zxing.BarcodeFormat.UPC_E) || collection.contains(com.google.zxing.BarcodeFormat.EAN_13) || collection.contains(com.google.zxing.BarcodeFormat.EAN_8) || collection.contains(com.google.zxing.BarcodeFormat.CODABAR) || collection.contains(com.google.zxing.BarcodeFormat.CODE_39) || collection.contains(com.google.zxing.BarcodeFormat.CODE_93) || collection.contains(com.google.zxing.BarcodeFormat.CODE_128) || collection.contains(com.google.zxing.BarcodeFormat.ITF) || collection.contains(com.google.zxing.BarcodeFormat.RSS_14) || collection.contains(com.google.zxing.BarcodeFormat.RSS_EXPANDED);
            if (z2 && !z) {
                arrayList.add(new com.google.zxing.oned.MultiFormatOneDReader(map));
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.QR_CODE)) {
                arrayList.add(new com.google.zxing.qrcode.QRCodeReader());
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new com.google.zxing.datamatrix.DataMatrixReader());
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.AZTEC)) {
                arrayList.add(new com.google.zxing.aztec.AztecReader());
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.PDF_417)) {
                arrayList.add(new com.google.zxing.pdf417.PDF417Reader());
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.MAXICODE)) {
                arrayList.add(new com.google.zxing.maxicode.MaxiCodeReader());
            }
            if (z2 && z) {
                arrayList.add(new com.google.zxing.oned.MultiFormatOneDReader(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new com.google.zxing.oned.MultiFormatOneDReader(map));
            }
            arrayList.add(new com.google.zxing.qrcode.QRCodeReader());
            arrayList.add(new com.google.zxing.datamatrix.DataMatrixReader());
            arrayList.add(new com.google.zxing.aztec.AztecReader());
            arrayList.add(new com.google.zxing.pdf417.PDF417Reader());
            arrayList.add(new com.google.zxing.maxicode.MaxiCodeReader());
            if (z) {
                arrayList.add(new com.google.zxing.oned.MultiFormatOneDReader(map));
            }
        }
        this.readers = (com.google.zxing.Reader[]) arrayList.toArray(EMPTY_READER_ARRAY);
    }

    @Override // com.google.zxing.Reader
    public final void reset() {
        com.google.zxing.Reader[] readerArr = this.readers;
        if (readerArr != null) {
            for (com.google.zxing.Reader reader : readerArr) {
                reader.reset();
            }
        }
    }

    private com.google.zxing.Result decodeInternal(com.google.zxing.BinaryBitmap binaryBitmap) throws com.google.zxing.NotFoundException {
        com.google.zxing.Reader[] readerArr = this.readers;
        if (readerArr != null) {
            for (com.google.zxing.Reader reader : readerArr) {
                if (java.lang.Thread.currentThread().isInterrupted()) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                try {
                    return reader.decode(binaryBitmap, this.hints);
                } catch (com.google.zxing.ReaderException unused) {
                }
            }
            java.util.Map<com.google.zxing.DecodeHintType, ?> map = this.hints;
            if (map != null && map.containsKey(com.google.zxing.DecodeHintType.ALSO_INVERTED)) {
                binaryBitmap.getBlackMatrix().flip();
                for (com.google.zxing.Reader reader2 : this.readers) {
                    if (java.lang.Thread.currentThread().isInterrupted()) {
                        throw com.google.zxing.NotFoundException.getNotFoundInstance();
                    }
                    try {
                        return reader2.decode(binaryBitmap, this.hints);
                    } catch (com.google.zxing.ReaderException unused2) {
                    }
                }
            }
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }
}
