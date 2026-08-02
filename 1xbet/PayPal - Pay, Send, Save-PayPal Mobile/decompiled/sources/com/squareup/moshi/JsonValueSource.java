package com.squareup.moshi;

/* loaded from: classes5.dex */
final class JsonValueSource implements okio.Source {
    final okio.BufferedSource getInputSizeshNQ4ISI;
    okio.ByteString getOutputMinFrameDuration;
    private final okio.Buffer getOutputMinFrameDurationlomOqCM;
    private int getOutputSizeshNQ4ISI;
    private final okio.Buffer getOutputStallDurationlomOqCM;
    static final okio.ByteString getHighResolutionOutputSizeshNQ4ISI = okio.ByteString.encodeUtf8("[]{}\"'/#");
    static final okio.ByteString getOutputFormats = okio.ByteString.encodeUtf8("'\\");
    static final okio.ByteString getHighSpeedVideoFpsRanges = okio.ByteString.encodeUtf8("\"\\");
    static final okio.ByteString getHighSpeedVideoSizes = okio.ByteString.encodeUtf8(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
    static final okio.ByteString Camera2StreamConfigurationMap = okio.ByteString.encodeUtf8("*");
    static final okio.ByteString getHighSpeedVideoFpsRangesFor = okio.ByteString.EMPTY;
    long getInputFormats = 0;
    boolean getHighSpeedVideoSizesFor = false;

    JsonValueSource(okio.BufferedSource bufferedSource, okio.Buffer buffer, okio.ByteString byteString, int i) {
        this.getInputSizeshNQ4ISI = bufferedSource;
        this.getOutputStallDurationlomOqCM = bufferedSource.getBuffer();
        this.getOutputMinFrameDurationlomOqCM = buffer;
        this.getOutputMinFrameDuration = byteString;
        this.getOutputSizeshNQ4ISI = i;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(long j) throws java.io.IOException {
        while (true) {
            long j2 = this.getInputFormats;
            if (j2 >= j) {
                return;
            }
            okio.ByteString byteString = this.getOutputMinFrameDuration;
            okio.ByteString byteString2 = getHighSpeedVideoFpsRangesFor;
            if (byteString == byteString2) {
                return;
            }
            if (j2 == this.getOutputStallDurationlomOqCM.size()) {
                if (this.getInputFormats > 0) {
                    return;
                } else {
                    this.getInputSizeshNQ4ISI.require(1L);
                }
            }
            long indexOfElement = this.getOutputStallDurationlomOqCM.indexOfElement(this.getOutputMinFrameDuration, this.getInputFormats);
            if (indexOfElement == -1) {
                this.getInputFormats = this.getOutputStallDurationlomOqCM.size();
            } else {
                byte b = this.getOutputStallDurationlomOqCM.getByte(indexOfElement);
                okio.ByteString byteString3 = this.getOutputMinFrameDuration;
                okio.ByteString byteString4 = getHighResolutionOutputSizeshNQ4ISI;
                if (byteString3 == byteString4) {
                    if (b == 34) {
                        this.getOutputMinFrameDuration = getHighSpeedVideoFpsRanges;
                        this.getInputFormats = indexOfElement + 1;
                    } else if (b == 35) {
                        this.getOutputMinFrameDuration = getHighSpeedVideoSizes;
                        this.getInputFormats = indexOfElement + 1;
                    } else if (b == 39) {
                        this.getOutputMinFrameDuration = getOutputFormats;
                        this.getInputFormats = indexOfElement + 1;
                    } else if (b != 47) {
                        if (b != 91) {
                            if (b != 93) {
                                if (b != 123) {
                                    if (b == 125) {
                                    }
                                }
                            }
                            int i = this.getOutputSizeshNQ4ISI - 1;
                            this.getOutputSizeshNQ4ISI = i;
                            if (i == 0) {
                                this.getOutputMinFrameDuration = byteString2;
                            }
                            this.getInputFormats = indexOfElement + 1;
                        }
                        this.getOutputSizeshNQ4ISI++;
                        this.getInputFormats = indexOfElement + 1;
                    } else {
                        long j3 = 2 + indexOfElement;
                        this.getInputSizeshNQ4ISI.require(j3);
                        long j4 = indexOfElement + 1;
                        byte b2 = this.getOutputStallDurationlomOqCM.getByte(j4);
                        if (b2 == 47) {
                            this.getOutputMinFrameDuration = getHighSpeedVideoSizes;
                            this.getInputFormats = j3;
                        } else if (b2 == 42) {
                            this.getOutputMinFrameDuration = Camera2StreamConfigurationMap;
                            this.getInputFormats = j3;
                        } else {
                            this.getInputFormats = j4;
                        }
                    }
                } else if (byteString3 == getOutputFormats || byteString3 == getHighSpeedVideoFpsRanges) {
                    if (b == 92) {
                        long j5 = indexOfElement + 2;
                        this.getInputSizeshNQ4ISI.require(j5);
                        this.getInputFormats = j5;
                    } else {
                        if (this.getOutputSizeshNQ4ISI > 0) {
                            byteString2 = byteString4;
                        }
                        this.getOutputMinFrameDuration = byteString2;
                        this.getInputFormats = indexOfElement + 1;
                    }
                } else if (byteString3 == Camera2StreamConfigurationMap) {
                    long j6 = 2 + indexOfElement;
                    this.getInputSizeshNQ4ISI.require(j6);
                    long j7 = indexOfElement + 1;
                    if (this.getOutputStallDurationlomOqCM.getByte(j7) == 47) {
                        this.getInputFormats = j6;
                        this.getOutputMinFrameDuration = byteString4;
                    } else {
                        this.getInputFormats = j7;
                    }
                } else if (byteString3 == getHighSpeedVideoSizes) {
                    this.getInputFormats = indexOfElement + 1;
                    this.getOutputMinFrameDuration = byteString4;
                } else {
                    throw new java.lang.AssertionError();
                }
            }
        }
    }

    @Override // okio.Source
    public final long read(okio.Buffer buffer, long j) throws java.io.IOException {
        if (this.getHighSpeedVideoSizesFor) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.getOutputMinFrameDurationlomOqCM.exhausted()) {
            long read = this.getOutputMinFrameDurationlomOqCM.read(buffer, j);
            if (!this.getOutputStallDurationlomOqCM.exhausted()) {
                long read2 = read(buffer, j - read);
                if (read2 != -1) {
                    return read2 + read;
                }
            }
            return read;
        }
        getHighResolutionOutputSizeshNQ4ISI(j);
        long j2 = this.getInputFormats;
        if (j2 == 0) {
            if (this.getOutputMinFrameDuration == getHighSpeedVideoFpsRangesFor) {
                return -1L;
            }
            throw new java.lang.AssertionError();
        }
        long min = java.lang.Math.min(j, j2);
        buffer.write(this.getOutputStallDurationlomOqCM, min);
        this.getInputFormats -= min;
        return min;
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final okio.Timeout getCamera2StreamConfigurationMap() {
        return this.getInputSizeshNQ4ISI.getCamera2StreamConfigurationMap();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.getHighSpeedVideoSizesFor = true;
    }
}
