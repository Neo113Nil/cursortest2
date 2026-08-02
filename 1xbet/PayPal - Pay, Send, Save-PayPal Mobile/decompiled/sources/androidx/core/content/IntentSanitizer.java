package androidx.core.content;

/* loaded from: classes7.dex */
public class IntentSanitizer {
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private androidx.core.util.Predicate<android.net.Uri> getHighSpeedVideoSizesFor;
    private androidx.core.util.Predicate<java.lang.String> getInputFormats;
    private androidx.core.util.Predicate<android.content.ComponentName> getInputSizeshNQ4ISI;
    private androidx.core.util.Predicate<android.content.ClipData> getOutputFormats;
    private androidx.core.util.Predicate<java.lang.String> getOutputMinFrameDuration;
    private java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> getOutputMinFrameDurationlomOqCM;
    private androidx.core.util.Predicate<java.lang.String> getOutputSizes;
    private androidx.core.util.Predicate<android.net.Uri> getOutputSizeshNQ4ISI;
    private androidx.core.util.Predicate<java.lang.String> getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor() {
    }

    /* synthetic */ IntentSanitizer(byte b) {
        this();
    }

    private IntentSanitizer() {
    }

    public android.content.Intent sanitizeByFiltering(android.content.Intent intent) {
        return sanitize(intent, new androidx.core.util.Consumer() { // from class: androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.core.content.IntentSanitizer.getHighSpeedVideoFpsRangesFor();
            }
        });
    }

    public android.content.Intent sanitizeByThrowing(android.content.Intent intent) {
        return sanitize(intent, new androidx.core.util.Consumer() { // from class: androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.core.content.IntentSanitizer.getHighSpeedVideoSizes((java.lang.String) obj);
            }
        });
    }

    static /* synthetic */ void getHighSpeedVideoSizes(java.lang.String str) {
        throw new java.lang.SecurityException(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.content.Intent sanitize(android.content.Intent intent, androidx.core.util.Consumer<java.lang.String> consumer) {
        java.lang.CharSequence charSequence;
        android.net.Uri uri;
        android.content.Intent intent2 = new android.content.Intent();
        android.content.ComponentName component = intent.getComponent();
        if ((this.getHighResolutionOutputSizeshNQ4ISI && component == null) || this.getInputSizeshNQ4ISI.test(component)) {
            intent2.setComponent(component);
        } else {
            consumer.accept("Component is not allowed: ".concat(java.lang.String.valueOf(component)));
            intent2.setComponent(new android.content.ComponentName(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME, "java.lang.Void"));
        }
        java.lang.String str = intent.getPackage();
        if (str == null || this.getOutputStallDuration.test(str)) {
            intent2.setPackage(str);
        } else {
            consumer.accept("Package is not allowed: ".concat(java.lang.String.valueOf(str)));
        }
        int i = this.getOutputStallDurationlomOqCM;
        int flags = intent.getFlags();
        int i2 = this.getOutputStallDurationlomOqCM;
        if ((i | flags) == i2) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The intent contains flags that are not allowed: 0x");
            sb.append(java.lang.Integer.toHexString(intent.getFlags() & (~this.getOutputStallDurationlomOqCM)));
            consumer.accept(sb.toString());
        }
        java.lang.String action = intent.getAction();
        if (action == null || this.getInputFormats.test(action)) {
            intent2.setAction(action);
        } else {
            consumer.accept("Action is not allowed: ".concat(java.lang.String.valueOf(action)));
        }
        android.net.Uri data = intent.getData();
        if (data == null || this.getOutputSizeshNQ4ISI.test(data)) {
            intent2.setData(data);
        } else {
            consumer.accept("Data is not allowed: ".concat(java.lang.String.valueOf(data)));
        }
        java.lang.String type = intent.getType();
        if (type == null || this.getOutputSizes.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            consumer.accept("Type is not allowed: ".concat(java.lang.String.valueOf(type)));
        }
        java.util.Set<java.lang.String> categories = intent.getCategories();
        if (categories != null) {
            for (java.lang.String str2 : categories) {
                if (this.getOutputMinFrameDuration.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    consumer.accept("Category is not allowed: ".concat(java.lang.String.valueOf(str2)));
                }
            }
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            for (java.lang.String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.getOutputStallDurationlomOqCM & 1) == 0) {
                    consumer.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (str3.equals("output") && ((~this.getOutputStallDurationlomOqCM) & 3) != 0) {
                    consumer.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                } else {
                    java.lang.Object obj = extras.get(str3);
                    androidx.core.util.Predicate<java.lang.Object> predicate = this.getOutputMinFrameDurationlomOqCM.get(str3);
                    if (predicate == null || !predicate.test(obj)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Extra is not allowed. Key: ");
                        sb2.append(str3);
                        sb2.append(". Value: ");
                        sb2.append(obj);
                        consumer.accept(sb2.toString());
                    } else if (obj == null) {
                        intent2.getExtras().putString(str3, null);
                    } else if (obj instanceof android.os.Parcelable) {
                        intent2.putExtra(str3, (android.os.Parcelable) obj);
                    } else if (obj instanceof android.os.Parcelable[]) {
                        intent2.putExtra(str3, (android.os.Parcelable[]) obj);
                    } else if (obj instanceof java.io.Serializable) {
                        intent2.putExtra(str3, (java.io.Serializable) obj);
                    } else {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unsupported type ");
                        sb3.append(obj.getClass());
                        throw new java.lang.IllegalArgumentException(sb3.toString());
                    }
                }
            }
        }
        androidx.core.util.Predicate<android.content.ClipData> predicate2 = this.getOutputFormats;
        boolean z = this.Camera2StreamConfigurationMap;
        androidx.core.util.Predicate<android.net.Uri> predicate3 = this.getHighSpeedVideoSizesFor;
        android.content.ClipData clipData = intent.getClipData();
        if (clipData != null) {
            if (predicate2 != null && predicate2.test(clipData)) {
                intent2.setClipData(clipData);
            } else {
                android.content.ClipData clipData2 = null;
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    android.content.ClipData.Item itemAt = clipData.getItemAt(i3);
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        androidx.core.content.IntentSanitizer.Api31Impl.getHighSpeedVideoFpsRangesFor(i3, itemAt, consumer);
                    } else if (itemAt.getHtmlText() != null || itemAt.getIntent() != null) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("ClipData item at position ");
                        sb4.append(i3);
                        sb4.append(" contains htmlText, textLinks or intent: ");
                        sb4.append(itemAt);
                        consumer.accept(sb4.toString());
                    }
                    if (z) {
                        charSequence = itemAt.getText();
                    } else {
                        if (itemAt.getText() != null) {
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Item text cannot contain value. Item position: ");
                            sb5.append(i3);
                            sb5.append(". Text: ");
                            sb5.append((java.lang.Object) itemAt.getText());
                            consumer.accept(sb5.toString());
                        }
                        charSequence = null;
                    }
                    if (predicate3 == null) {
                        if (itemAt.getUri() != null) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Item URI is not allowed. Item position: ");
                            sb6.append(i3);
                            sb6.append(". URI: ");
                            sb6.append(itemAt.getUri());
                            consumer.accept(sb6.toString());
                        }
                    } else if (itemAt.getUri() == null || predicate3.test(itemAt.getUri())) {
                        uri = itemAt.getUri();
                        if (charSequence == null || uri != null) {
                            if (clipData2 != null) {
                                clipData2 = new android.content.ClipData(clipData.getDescription(), new android.content.ClipData.Item(charSequence, null, uri));
                            } else {
                                clipData2.addItem(new android.content.ClipData.Item(charSequence, null, uri));
                            }
                        }
                    } else {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Item URI is not allowed. Item position: ");
                        sb7.append(i3);
                        sb7.append(". URI: ");
                        sb7.append(itemAt.getUri());
                        consumer.accept(sb7.toString());
                    }
                    uri = null;
                    if (charSequence == null) {
                    }
                    if (clipData2 != null) {
                    }
                }
                if (clipData2 != null) {
                    intent2.setClipData(clipData2);
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            if (this.getHighSpeedVideoSizes) {
                androidx.core.content.IntentSanitizer.Api29Impl.getHighSpeedVideoSizes(intent2, androidx.core.content.IntentSanitizer.Api29Impl.getHighSpeedVideoFpsRangesFor(intent));
            } else if (androidx.core.content.IntentSanitizer.Api29Impl.getHighSpeedVideoFpsRangesFor(intent) != null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Identifier is not allowed: ");
                sb8.append(androidx.core.content.IntentSanitizer.Api29Impl.getHighSpeedVideoFpsRangesFor(intent));
                consumer.accept(sb8.toString());
            }
        }
        if (this.getHighSpeedVideoFpsRanges) {
            intent2.setSelector(intent.getSelector());
        } else if (intent.getSelector() != null) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Selector is not allowed: ");
            sb9.append(intent.getSelector());
            consumer.accept(sb9.toString());
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            intent2.setSourceBounds(intent.getSourceBounds());
            return intent2;
        }
        if (intent.getSourceBounds() != null) {
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("SourceBounds is not allowed: ");
            sb10.append(intent.getSourceBounds());
            consumer.accept(sb10.toString());
        }
        return intent2;
    }

    public static final class Builder {
        private boolean Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoSizes;
        private boolean getOutputMinFrameDuration;
        private int getOutputSizeshNQ4ISI;
        private androidx.core.util.Predicate<java.lang.String> getInputSizeshNQ4ISI = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda10
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.Camera2StreamConfigurationMap();
            }
        };
        private androidx.core.util.Predicate<android.net.Uri> getOutputMinFrameDurationlomOqCM = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda11
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.getHighResolutionOutputSizeshNQ4ISI();
            }
        };
        private androidx.core.util.Predicate<java.lang.String> getValidOutputFormatsForInputhNQ4ISI = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda12
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.getInputSizeshNQ4ISI();
            }
        };
        private androidx.core.util.Predicate<java.lang.String> getHighSpeedVideoSizesFor = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda13
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.getOutputFormats();
            }
        };
        private androidx.core.util.Predicate<java.lang.String> getOutputStallDurationlomOqCM = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda14
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.getOutputMinFrameDuration();
            }
        };
        private androidx.core.util.Predicate<android.content.ComponentName> getOutputStallDuration = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda15
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.getInputFormats();
            }
        };
        private java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> getOutputSizes = new java.util.HashMap();
        private boolean getHighSpeedVideoFpsRangesFor = false;
        private androidx.core.util.Predicate<android.net.Uri> getInputFormats = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda16
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.getHighSpeedVideoSizesFor();
            }
        };
        private androidx.core.util.Predicate<android.content.ClipData> getOutputFormats = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda17
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.getOutputSizeshNQ4ISI();
            }
        };

        static /* synthetic */ boolean Camera2StreamConfigurationMap() {
            return false;
        }

        static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI() {
            return false;
        }

        static /* synthetic */ boolean getHighSpeedVideoFpsRanges() {
            return true;
        }

        static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor() {
            return true;
        }

        static /* synthetic */ boolean getHighSpeedVideoSizes() {
            return false;
        }

        static /* synthetic */ boolean getHighSpeedVideoSizesFor() {
            return false;
        }

        static /* synthetic */ boolean getInputFormats() {
            return false;
        }

        static /* synthetic */ boolean getInputSizeshNQ4ISI() {
            return false;
        }

        static /* synthetic */ boolean getOutputFormats() {
            return false;
        }

        static /* synthetic */ boolean getOutputMinFrameDuration() {
            return false;
        }

        static /* synthetic */ boolean getOutputSizeshNQ4ISI() {
            return false;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowFlags(int i) {
            this.getOutputSizeshNQ4ISI = i | this.getOutputSizeshNQ4ISI;
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowHistoryStackFlags() {
            this.getOutputSizeshNQ4ISI |= 2112614400;
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowReceiverFlags() {
            this.getOutputSizeshNQ4ISI |= 2015363072;
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowAction(java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            java.util.Objects.requireNonNull(str);
            allowAction(new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1(str));
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowAction(androidx.core.util.Predicate<java.lang.String> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.getInputSizeshNQ4ISI = this.getInputSizeshNQ4ISI.or(predicate);
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowDataWithAuthority(final java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            allowData(new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda3
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    boolean equals;
                    equals = str.equals(((android.net.Uri) obj).getAuthority());
                    return equals;
                }
            });
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowData(androidx.core.util.Predicate<android.net.Uri> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.getOutputMinFrameDurationlomOqCM = this.getOutputMinFrameDurationlomOqCM.or(predicate);
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowType(java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            java.util.Objects.requireNonNull(str);
            return allowType(new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1(str));
        }

        public final androidx.core.content.IntentSanitizer.Builder allowType(androidx.core.util.Predicate<java.lang.String> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.getValidOutputFormatsForInputhNQ4ISI = this.getValidOutputFormatsForInputhNQ4ISI.or(predicate);
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowCategory(java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            java.util.Objects.requireNonNull(str);
            return allowCategory(new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1(str));
        }

        public final androidx.core.content.IntentSanitizer.Builder allowCategory(androidx.core.util.Predicate<java.lang.String> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizesFor.or(predicate);
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowPackage(java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            java.util.Objects.requireNonNull(str);
            return allowPackage(new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1(str));
        }

        public final androidx.core.content.IntentSanitizer.Builder allowPackage(androidx.core.util.Predicate<java.lang.String> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.getOutputStallDurationlomOqCM = this.getOutputStallDurationlomOqCM.or(predicate);
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowComponent(final android.content.ComponentName componentName) {
            androidx.core.util.Preconditions.checkNotNull(componentName);
            java.util.Objects.requireNonNull(componentName);
            return allowComponent(new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda5
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    boolean equals;
                    equals = componentName.equals((android.content.ComponentName) obj);
                    return equals;
                }
            });
        }

        public final androidx.core.content.IntentSanitizer.Builder allowComponent(androidx.core.util.Predicate<android.content.ComponentName> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getOutputStallDuration = this.getOutputStallDuration.or(predicate);
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowComponentWithPackage(final java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            return allowComponent(new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda2
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    boolean equals;
                    equals = str.equals(((android.content.ComponentName) obj).getPackageName());
                    return equals;
                }
            });
        }

        public final androidx.core.content.IntentSanitizer.Builder allowAnyComponent() {
            this.getHighSpeedVideoSizes = true;
            this.getOutputStallDuration = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda6
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return androidx.core.content.IntentSanitizer.Builder.getHighSpeedVideoFpsRanges();
                }
            };
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowClipDataText() {
            this.getHighSpeedVideoFpsRangesFor = true;
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowClipDataUriWithAuthority(final java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            return allowClipDataUri(new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda7
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    boolean equals;
                    equals = str.equals(((android.net.Uri) obj).getAuthority());
                    return equals;
                }
            });
        }

        public final androidx.core.content.IntentSanitizer.Builder allowClipDataUri(androidx.core.util.Predicate<android.net.Uri> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.getInputFormats = this.getInputFormats.or(predicate);
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowClipData(androidx.core.util.Predicate<android.content.ClipData> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.getOutputFormats = this.getOutputFormats.or(predicate);
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowExtra(java.lang.String str, java.lang.Class<?> cls) {
            return allowExtra(str, cls, new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda18
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return androidx.core.content.IntentSanitizer.Builder.getHighSpeedVideoFpsRangesFor();
                }
            });
        }

        public final <T> androidx.core.content.IntentSanitizer.Builder allowExtra(java.lang.String str, final java.lang.Class<T> cls, final androidx.core.util.Predicate<T> predicate) {
            androidx.core.util.Preconditions.checkNotNull(str);
            androidx.core.util.Preconditions.checkNotNull(cls);
            androidx.core.util.Preconditions.checkNotNull(predicate);
            return allowExtra(str, new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda4
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return androidx.core.content.IntentSanitizer.Builder.getHighSpeedVideoSizes(cls, predicate, obj);
                }
            });
        }

        static /* synthetic */ boolean getHighSpeedVideoSizes(java.lang.Class cls, androidx.core.util.Predicate predicate, java.lang.Object obj) {
            return cls.isInstance(obj) && predicate.test(cls.cast(obj));
        }

        public final androidx.core.content.IntentSanitizer.Builder allowExtra(java.lang.String str, androidx.core.util.Predicate<java.lang.Object> predicate) {
            androidx.core.util.Preconditions.checkNotNull(str);
            androidx.core.util.Preconditions.checkNotNull(predicate);
            androidx.core.util.Predicate<java.lang.Object> predicate2 = this.getOutputSizes.get(str);
            if (predicate2 == null) {
                predicate2 = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda8
                    @Override // androidx.core.util.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return androidx.core.content.IntentSanitizer.Builder.getHighSpeedVideoSizes();
                    }
                };
            }
            this.getOutputSizes.put(str, predicate2.or(predicate));
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowExtraStreamUriWithAuthority(final java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            allowExtra("android.intent.extra.STREAM", android.net.Uri.class, new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda9
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    boolean equals;
                    equals = str.equals(((android.net.Uri) obj).getAuthority());
                    return equals;
                }
            });
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowExtraStream(androidx.core.util.Predicate<android.net.Uri> predicate) {
            allowExtra("android.intent.extra.STREAM", android.net.Uri.class, predicate);
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowExtraOutput(final java.lang.String str) {
            allowExtra("output", android.net.Uri.class, new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    boolean equals;
                    equals = str.equals(((android.net.Uri) obj).getAuthority());
                    return equals;
                }
            });
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowExtraOutput(androidx.core.util.Predicate<android.net.Uri> predicate) {
            allowExtra("output", android.net.Uri.class, predicate);
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowIdentifier() {
            this.Camera2StreamConfigurationMap = true;
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowSelector() {
            this.getHighSpeedVideoFpsRanges = true;
            return this;
        }

        public final androidx.core.content.IntentSanitizer.Builder allowSourceBounds() {
            this.getOutputMinFrameDuration = true;
            return this;
        }

        public final androidx.core.content.IntentSanitizer build() {
            boolean z = this.getHighSpeedVideoSizes;
            if ((z && this.getHighResolutionOutputSizeshNQ4ISI) || (!z && !this.getHighResolutionOutputSizeshNQ4ISI)) {
                throw new java.lang.SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            androidx.core.content.IntentSanitizer intentSanitizer = new androidx.core.content.IntentSanitizer((byte) 0);
            intentSanitizer.getOutputStallDurationlomOqCM = this.getOutputSizeshNQ4ISI;
            intentSanitizer.getInputFormats = this.getInputSizeshNQ4ISI;
            intentSanitizer.getOutputSizeshNQ4ISI = this.getOutputMinFrameDurationlomOqCM;
            intentSanitizer.getOutputSizes = this.getValidOutputFormatsForInputhNQ4ISI;
            intentSanitizer.getOutputMinFrameDuration = this.getHighSpeedVideoSizesFor;
            intentSanitizer.getOutputStallDuration = this.getOutputStallDurationlomOqCM;
            intentSanitizer.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes;
            intentSanitizer.getInputSizeshNQ4ISI = this.getOutputStallDuration;
            intentSanitizer.getOutputMinFrameDurationlomOqCM = this.getOutputSizes;
            intentSanitizer.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
            intentSanitizer.getHighSpeedVideoSizesFor = this.getInputFormats;
            intentSanitizer.getOutputFormats = this.getOutputFormats;
            intentSanitizer.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap;
            intentSanitizer.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
            intentSanitizer.getHighSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration;
            return intentSanitizer;
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static void getHighSpeedVideoFpsRangesFor(int i, android.content.ClipData.Item item, androidx.core.util.Consumer<java.lang.String> consumer) {
            if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClipData item at position ");
            sb.append(i);
            sb.append(" contains htmlText, textLinks or intent: ");
            sb.append(item);
            consumer.accept(sb.toString());
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.content.Intent getHighSpeedVideoSizes(android.content.Intent intent, java.lang.String str) {
            return intent.setIdentifier(str);
        }

        static java.lang.String getHighSpeedVideoFpsRangesFor(android.content.Intent intent) {
            return intent.getIdentifier();
        }
    }
}
