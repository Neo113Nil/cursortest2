package androidx.core.content.pm;

/* loaded from: classes7.dex */
public class ShortcutInfoCompat {
    public static final int SURFACE_LAUNCHER = 1;
    java.lang.CharSequence ArtificialStackFrames;
    android.content.Context Camera2StreamConfigurationMap;
    androidx.core.app.Person[] CoroutineDebuggingKt;
    android.os.UserHandle _CREATION;
    androidx.core.content.LocusIdCompat accessartificialFrame;
    android.os.Bundle b;
    long coroutineBoundary;
    java.lang.String coroutineCreation;
    int getARTIFICIAL_FRAME_PACKAGE_NAME;
    java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;
    java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    android.content.ComponentName getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    android.os.PersistableBundle getInputFormats;
    java.lang.String getInputSizeshNQ4ISI;
    androidx.core.graphics.drawable.IconCompat getOutputFormats;
    int getOutputMinFrameDuration;
    android.content.Intent[] getOutputMinFrameDurationlomOqCM;
    boolean getOutputSizes;
    boolean getOutputSizeshNQ4ISI;
    boolean getOutputStallDuration;
    boolean getOutputStallDurationlomOqCM;
    java.lang.CharSequence getValidOutputFormatsForInputhNQ4ISI;
    boolean isOutputSupportedFor;
    boolean isOutputSupportedForhNQ4ISI;
    boolean toString;
    boolean unwrapAs = true;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Surface {
    }

    ShortcutInfoCompat() {
    }

    public android.content.pm.ShortcutInfo toShortcutInfo() {
        android.content.pm.ShortcutInfo.Builder intents = new android.content.pm.ShortcutInfo.Builder(this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI).setShortLabel(this.getValidOutputFormatsForInputhNQ4ISI).setIntents(this.getOutputMinFrameDurationlomOqCM);
        androidx.core.graphics.drawable.IconCompat iconCompat = this.getOutputFormats;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.toIcon(this.Camera2StreamConfigurationMap));
        }
        if (!android.text.TextUtils.isEmpty(this.ArtificialStackFrames)) {
            intents.setLongLabel(this.ArtificialStackFrames);
        }
        if (!android.text.TextUtils.isEmpty(this.getHighResolutionOutputSizeshNQ4ISI)) {
            intents.setDisabledMessage(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        android.content.ComponentName componentName = this.getHighSpeedVideoSizes;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        java.util.Set<java.lang.String> set = this.getHighSpeedVideoFpsRanges;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        android.os.PersistableBundle persistableBundle = this.getInputFormats;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.app.Person[] personArr = this.CoroutineDebuggingKt;
            if (personArr != null && personArr.length > 0) {
                int length = personArr.length;
                android.app.Person[] personArr2 = new android.app.Person[length];
                for (int i = 0; i < length; i++) {
                    personArr2[i] = this.CoroutineDebuggingKt[i].toAndroidPerson();
                }
                intents.setPersons(personArr2);
            }
            androidx.core.content.LocusIdCompat locusIdCompat = this.accessartificialFrame;
            if (locusIdCompat != null) {
                intents.setLocusId(locusIdCompat.toLocusId());
            }
            intents.setLongLived(this.isOutputSupportedFor);
        } else {
            intents.setExtras(getHighResolutionOutputSizeshNQ4ISI());
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.core.content.pm.ShortcutInfoCompat.Api33Impl.getHighSpeedVideoSizes(intents, this.getOutputMinFrameDuration);
        }
        return intents.build();
    }

    private android.os.PersistableBundle getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getInputFormats == null) {
            this.getInputFormats = new android.os.PersistableBundle();
        }
        androidx.core.app.Person[] personArr = this.CoroutineDebuggingKt;
        if (personArr != null && personArr.length > 0) {
            this.getInputFormats.putInt("extraPersonCount", personArr.length);
            int i = 0;
            while (i < this.CoroutineDebuggingKt.length) {
                android.os.PersistableBundle persistableBundle = this.getInputFormats;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("extraPerson_");
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.CoroutineDebuggingKt[i].toPersistableBundle());
                i = i2;
            }
        }
        androidx.core.content.LocusIdCompat locusIdCompat = this.accessartificialFrame;
        if (locusIdCompat != null) {
            this.getInputFormats.putString("extraLocusId", locusIdCompat.getId());
        }
        this.getInputFormats.putBoolean("extraLongLived", this.isOutputSupportedFor);
        return this.getInputFormats;
    }

    android.content.Intent getHighSpeedVideoSizes(android.content.Intent intent) {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.getOutputMinFrameDurationlomOqCM[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.getValidOutputFormatsForInputhNQ4ISI.toString());
        if (this.getOutputFormats != null) {
            android.graphics.drawable.Drawable drawable = null;
            if (this.getOutputSizes) {
                android.content.pm.PackageManager packageManager = this.Camera2StreamConfigurationMap.getPackageManager();
                android.content.ComponentName componentName = this.getHighSpeedVideoSizes;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.Camera2StreamConfigurationMap.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.getOutputFormats.addToShortcutIntent(intent, drawable, this.Camera2StreamConfigurationMap);
        }
        return intent;
    }

    public java.lang.String getId() {
        return this.getInputSizeshNQ4ISI;
    }

    public java.lang.String getPackage() {
        return this.coroutineCreation;
    }

    public android.content.ComponentName getActivity() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.CharSequence getShortLabel() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public java.lang.CharSequence getLongLabel() {
        return this.ArtificialStackFrames;
    }

    public java.lang.CharSequence getDisabledMessage() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getDisabledReason() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public android.content.Intent getIntent() {
        return this.getOutputMinFrameDurationlomOqCM[r0.length - 1];
    }

    public android.content.Intent[] getIntents() {
        android.content.Intent[] intentArr = this.getOutputMinFrameDurationlomOqCM;
        return (android.content.Intent[]) java.util.Arrays.copyOf(intentArr, intentArr.length);
    }

    public java.util.Set<java.lang.String> getCategories() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public androidx.core.content.LocusIdCompat getLocusId() {
        return this.accessartificialFrame;
    }

    public int getRank() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
        return this.getOutputFormats;
    }

    static androidx.core.app.Person[] getHighSpeedVideoFpsRanges(android.os.PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey("extraPersonCount")) {
            return null;
        }
        int i = persistableBundle.getInt("extraPersonCount");
        androidx.core.app.Person[] personArr = new androidx.core.app.Person[i];
        int i2 = 0;
        while (i2 < i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("extraPerson_");
            int i3 = i2 + 1;
            sb.append(i3);
            personArr[i2] = androidx.core.app.Person.fromPersistableBundle(persistableBundle.getPersistableBundle(sb.toString()));
            i2 = i3;
        }
        return personArr;
    }

    static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getHighSpeedVideoFpsRangesFor(android.content.Context context, java.util.List<android.content.pm.ShortcutInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<android.content.pm.ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new androidx.core.content.pm.ShortcutInfoCompat.Builder(context, it.next()).build());
        }
        return arrayList;
    }

    public android.os.PersistableBundle getExtras() {
        return this.getInputFormats;
    }

    public android.os.Bundle getTransientExtras() {
        return this.b;
    }

    public android.os.UserHandle getUserHandle() {
        return this._CREATION;
    }

    public long getLastChangedTimestamp() {
        return this.coroutineBoundary;
    }

    public boolean isCached() {
        return this.getOutputStallDurationlomOqCM;
    }

    public boolean isDynamic() {
        return this.getOutputStallDuration;
    }

    public boolean isPinned() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public boolean isDeclaredInManifest() {
        return this.getOutputSizeshNQ4ISI;
    }

    public boolean isImmutable() {
        return this.toString;
    }

    public boolean isEnabled() {
        return this.unwrapAs;
    }

    public boolean hasKeyFieldsOnly() {
        return this.getHighSpeedVideoSizesFor;
    }

    static androidx.core.content.LocusIdCompat Camera2StreamConfigurationMap(android.content.pm.ShortcutInfo shortcutInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            if (shortcutInfo.getLocusId() == null) {
                return null;
            }
            return androidx.core.content.LocusIdCompat.toLocusIdCompat(shortcutInfo.getLocusId());
        }
        return getHighSpeedVideoFpsRangesFor(shortcutInfo.getExtras());
    }

    public boolean isExcludedFromSurfaces(int i) {
        return (i & this.getOutputMinFrameDuration) != 0;
    }

    public int getExcludedFromSurfaces() {
        return this.getOutputMinFrameDuration;
    }

    private static androidx.core.content.LocusIdCompat getHighSpeedVideoFpsRangesFor(android.os.PersistableBundle persistableBundle) {
        java.lang.String string;
        if (persistableBundle == null || (string = persistableBundle.getString("extraLocusId")) == null) {
            return null;
        }
        return new androidx.core.content.LocusIdCompat(string);
    }

    public static class Builder {
        private android.net.Uri Camera2StreamConfigurationMap;
        private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> getHighResolutionOutputSizeshNQ4ISI;
        private java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private final androidx.core.content.pm.ShortcutInfoCompat getHighSpeedVideoSizes;

        public Builder(android.content.Context context, java.lang.String str) {
            androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat = new androidx.core.content.pm.ShortcutInfoCompat();
            this.getHighSpeedVideoSizes = shortcutInfoCompat;
            shortcutInfoCompat.Camera2StreamConfigurationMap = context;
            shortcutInfoCompat.getInputSizeshNQ4ISI = str;
        }

        public Builder(androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat) {
            androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat2 = new androidx.core.content.pm.ShortcutInfoCompat();
            this.getHighSpeedVideoSizes = shortcutInfoCompat2;
            shortcutInfoCompat2.Camera2StreamConfigurationMap = shortcutInfoCompat.Camera2StreamConfigurationMap;
            shortcutInfoCompat2.getInputSizeshNQ4ISI = shortcutInfoCompat.getInputSizeshNQ4ISI;
            shortcutInfoCompat2.coroutineCreation = shortcutInfoCompat.coroutineCreation;
            shortcutInfoCompat2.getOutputMinFrameDurationlomOqCM = (android.content.Intent[]) java.util.Arrays.copyOf(shortcutInfoCompat.getOutputMinFrameDurationlomOqCM, shortcutInfoCompat.getOutputMinFrameDurationlomOqCM.length);
            shortcutInfoCompat2.getHighSpeedVideoSizes = shortcutInfoCompat.getHighSpeedVideoSizes;
            shortcutInfoCompat2.getValidOutputFormatsForInputhNQ4ISI = shortcutInfoCompat.getValidOutputFormatsForInputhNQ4ISI;
            shortcutInfoCompat2.ArtificialStackFrames = shortcutInfoCompat.ArtificialStackFrames;
            shortcutInfoCompat2.getHighResolutionOutputSizeshNQ4ISI = shortcutInfoCompat.getHighResolutionOutputSizeshNQ4ISI;
            shortcutInfoCompat2.getHighSpeedVideoFpsRangesFor = shortcutInfoCompat.getHighSpeedVideoFpsRangesFor;
            shortcutInfoCompat2.getOutputFormats = shortcutInfoCompat.getOutputFormats;
            shortcutInfoCompat2.getOutputSizes = shortcutInfoCompat.getOutputSizes;
            shortcutInfoCompat2._CREATION = shortcutInfoCompat._CREATION;
            shortcutInfoCompat2.coroutineBoundary = shortcutInfoCompat.coroutineBoundary;
            shortcutInfoCompat2.getOutputStallDurationlomOqCM = shortcutInfoCompat.getOutputStallDurationlomOqCM;
            shortcutInfoCompat2.getOutputStallDuration = shortcutInfoCompat.getOutputStallDuration;
            shortcutInfoCompat2.isOutputSupportedForhNQ4ISI = shortcutInfoCompat.isOutputSupportedForhNQ4ISI;
            shortcutInfoCompat2.getOutputSizeshNQ4ISI = shortcutInfoCompat.getOutputSizeshNQ4ISI;
            shortcutInfoCompat2.toString = shortcutInfoCompat.toString;
            shortcutInfoCompat2.unwrapAs = shortcutInfoCompat.unwrapAs;
            shortcutInfoCompat2.accessartificialFrame = shortcutInfoCompat.accessartificialFrame;
            shortcutInfoCompat2.isOutputSupportedFor = shortcutInfoCompat.isOutputSupportedFor;
            shortcutInfoCompat2.getHighSpeedVideoSizesFor = shortcutInfoCompat.getHighSpeedVideoSizesFor;
            shortcutInfoCompat2.getARTIFICIAL_FRAME_PACKAGE_NAME = shortcutInfoCompat.getARTIFICIAL_FRAME_PACKAGE_NAME;
            if (shortcutInfoCompat.CoroutineDebuggingKt != null) {
                shortcutInfoCompat2.CoroutineDebuggingKt = (androidx.core.app.Person[]) java.util.Arrays.copyOf(shortcutInfoCompat.CoroutineDebuggingKt, shortcutInfoCompat.CoroutineDebuggingKt.length);
            }
            if (shortcutInfoCompat.getHighSpeedVideoFpsRanges != null) {
                shortcutInfoCompat2.getHighSpeedVideoFpsRanges = new java.util.HashSet(shortcutInfoCompat.getHighSpeedVideoFpsRanges);
            }
            if (shortcutInfoCompat.getInputFormats != null) {
                shortcutInfoCompat2.getInputFormats = shortcutInfoCompat.getInputFormats;
            }
            shortcutInfoCompat2.getOutputMinFrameDuration = shortcutInfoCompat.getOutputMinFrameDuration;
        }

        public Builder(android.content.Context context, android.content.pm.ShortcutInfo shortcutInfo) {
            androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat = new androidx.core.content.pm.ShortcutInfoCompat();
            this.getHighSpeedVideoSizes = shortcutInfoCompat;
            shortcutInfoCompat.Camera2StreamConfigurationMap = context;
            shortcutInfoCompat.getInputSizeshNQ4ISI = shortcutInfo.getId();
            shortcutInfoCompat.coroutineCreation = shortcutInfo.getPackage();
            android.content.Intent[] intents = shortcutInfo.getIntents();
            shortcutInfoCompat.getOutputMinFrameDurationlomOqCM = (android.content.Intent[]) java.util.Arrays.copyOf(intents, intents.length);
            shortcutInfoCompat.getHighSpeedVideoSizes = shortcutInfo.getActivity();
            shortcutInfoCompat.getValidOutputFormatsForInputhNQ4ISI = shortcutInfo.getShortLabel();
            shortcutInfoCompat.ArtificialStackFrames = shortcutInfo.getLongLabel();
            shortcutInfoCompat.getHighResolutionOutputSizeshNQ4ISI = shortcutInfo.getDisabledMessage();
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                shortcutInfoCompat.getHighSpeedVideoFpsRangesFor = shortcutInfo.getDisabledReason();
            } else {
                shortcutInfoCompat.getHighSpeedVideoFpsRangesFor = shortcutInfo.isEnabled() ? 0 : 3;
            }
            shortcutInfoCompat.getHighSpeedVideoFpsRanges = shortcutInfo.getCategories();
            shortcutInfoCompat.CoroutineDebuggingKt = androidx.core.content.pm.ShortcutInfoCompat.getHighSpeedVideoFpsRanges(shortcutInfo.getExtras());
            shortcutInfoCompat._CREATION = shortcutInfo.getUserHandle();
            shortcutInfoCompat.coroutineBoundary = shortcutInfo.getLastChangedTimestamp();
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                shortcutInfoCompat.getOutputStallDurationlomOqCM = shortcutInfo.isCached();
            }
            shortcutInfoCompat.getOutputStallDuration = shortcutInfo.isDynamic();
            shortcutInfoCompat.isOutputSupportedForhNQ4ISI = shortcutInfo.isPinned();
            shortcutInfoCompat.getOutputSizeshNQ4ISI = shortcutInfo.isDeclaredInManifest();
            shortcutInfoCompat.toString = shortcutInfo.isImmutable();
            shortcutInfoCompat.unwrapAs = shortcutInfo.isEnabled();
            shortcutInfoCompat.getHighSpeedVideoSizesFor = shortcutInfo.hasKeyFieldsOnly();
            shortcutInfoCompat.accessartificialFrame = androidx.core.content.pm.ShortcutInfoCompat.Camera2StreamConfigurationMap(shortcutInfo);
            shortcutInfoCompat.getARTIFICIAL_FRAME_PACKAGE_NAME = shortcutInfo.getRank();
            shortcutInfoCompat.getInputFormats = shortcutInfo.getExtras();
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setShortLabel(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes.getValidOutputFormatsForInputhNQ4ISI = charSequence;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLabel(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes.ArtificialStackFrames = charSequence;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setDisabledMessage(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI = charSequence;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIntent(android.content.Intent intent) {
            return setIntents(new android.content.Intent[]{intent});
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIntents(android.content.Intent[] intentArr) {
            this.getHighSpeedVideoSizes.getOutputMinFrameDurationlomOqCM = intentArr;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
            this.getHighSpeedVideoSizes.getOutputFormats = iconCompat;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLocusId(androidx.core.content.LocusIdCompat locusIdCompat) {
            this.getHighSpeedVideoSizes.accessartificialFrame = locusIdCompat;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIsConversation() {
            this.getHighSpeedVideoFpsRangesFor = true;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setActivity(android.content.ComponentName componentName) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes = componentName;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setAlwaysBadged() {
            this.getHighSpeedVideoSizes.getOutputSizes = true;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setPerson(androidx.core.app.Person person) {
            return setPersons(new androidx.core.app.Person[]{person});
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setPersons(androidx.core.app.Person[] personArr) {
            this.getHighSpeedVideoSizes.CoroutineDebuggingKt = personArr;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setCategories(java.util.Set<java.lang.String> set) {
            androidx.collection.ArraySet arraySet = new androidx.collection.ArraySet();
            arraySet.addAll(set);
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges = arraySet;
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLived() {
            this.getHighSpeedVideoSizes.isOutputSupportedFor = true;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLived(boolean z) {
            this.getHighSpeedVideoSizes.isOutputSupportedFor = z;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setExcludedFromSurfaces(int i) {
            this.getHighSpeedVideoSizes.getOutputMinFrameDuration = i;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setRank(int i) {
            this.getHighSpeedVideoSizes.getARTIFICIAL_FRAME_PACKAGE_NAME = i;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setExtras(android.os.PersistableBundle persistableBundle) {
            this.getHighSpeedVideoSizes.getInputFormats = persistableBundle;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setTransientExtras(android.os.Bundle bundle) {
            this.getHighSpeedVideoSizes.b = (android.os.Bundle) androidx.core.util.Preconditions.checkNotNull(bundle);
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder addCapabilityBinding(java.lang.String str) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new java.util.HashSet();
            }
            this.getHighSpeedVideoFpsRanges.add(str);
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder addCapabilityBinding(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
            addCapabilityBinding(str);
            if (!list.isEmpty()) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI.get(str) == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI.put(str, new java.util.HashMap());
                }
                this.getHighResolutionOutputSizeshNQ4ISI.get(str).put(str2, list);
            }
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setSliceUri(android.net.Uri uri) {
            this.Camera2StreamConfigurationMap = uri;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat build() {
            if (android.text.TextUtils.isEmpty(this.getHighSpeedVideoSizes.getValidOutputFormatsForInputhNQ4ISI)) {
                throw new java.lang.IllegalArgumentException("Shortcut must have a non-empty label");
            }
            if (this.getHighSpeedVideoSizes.getOutputMinFrameDurationlomOqCM == null || this.getHighSpeedVideoSizes.getOutputMinFrameDurationlomOqCM.length == 0) {
                throw new java.lang.IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                if (this.getHighSpeedVideoSizes.accessartificialFrame == null) {
                    this.getHighSpeedVideoSizes.accessartificialFrame = new androidx.core.content.LocusIdCompat(this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI);
                }
                this.getHighSpeedVideoSizes.isOutputSupportedFor = true;
            }
            if (this.getHighSpeedVideoFpsRanges != null) {
                if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges == null) {
                    this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges = new java.util.HashSet();
                }
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.addAll(this.getHighSpeedVideoFpsRanges);
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                if (this.getHighSpeedVideoSizes.getInputFormats == null) {
                    this.getHighSpeedVideoSizes.getInputFormats = new android.os.PersistableBundle();
                }
                for (java.lang.String str : this.getHighResolutionOutputSizeshNQ4ISI.keySet()) {
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.getHighResolutionOutputSizeshNQ4ISI.get(str);
                    this.getHighSpeedVideoSizes.getInputFormats.putStringArray(str, (java.lang.String[]) map.keySet().toArray(new java.lang.String[0]));
                    for (java.lang.String str2 : map.keySet()) {
                        java.util.List<java.lang.String> list = map.get(str2);
                        android.os.PersistableBundle persistableBundle = this.getHighSpeedVideoSizes.getInputFormats;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                        sb.append(str2);
                        persistableBundle.putStringArray(sb.toString(), list == null ? new java.lang.String[0] : (java.lang.String[]) list.toArray(new java.lang.String[0]));
                    }
                }
            }
            if (this.Camera2StreamConfigurationMap != null) {
                if (this.getHighSpeedVideoSizes.getInputFormats == null) {
                    this.getHighSpeedVideoSizes.getInputFormats = new android.os.PersistableBundle();
                }
                this.getHighSpeedVideoSizes.getInputFormats.putString("extraSliceUri", androidx.core.net.UriCompat.toSafeString(this.Camera2StreamConfigurationMap));
            }
            return this.getHighSpeedVideoSizes;
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static void getHighSpeedVideoSizes(android.content.pm.ShortcutInfo.Builder builder, int i) {
            builder.setExcludedFromSurfaces(i);
        }
    }
}
