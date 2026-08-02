package androidx.core.app;

/* loaded from: classes3.dex */
public class Person {
    java.lang.CharSequence Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoFpsRanges;
    androidx.core.graphics.drawable.IconCompat getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    java.lang.String getInputFormats;

    public static androidx.core.app.Person fromBundle(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("icon");
        return new androidx.core.app.Person.Builder().setName(bundle.getCharSequence("name")).setIcon(bundle2 != null ? androidx.core.graphics.drawable.IconCompat.createFromBundle(bundle2) : null).setUri(bundle.getString("uri")).setKey(bundle.getString("key")).setBot(bundle.getBoolean("isBot")).setImportant(bundle.getBoolean("isImportant")).build();
    }

    public static androidx.core.app.Person fromPersistableBundle(android.os.PersistableBundle persistableBundle) {
        return androidx.core.app.Person.Api22Impl.getHighSpeedVideoSizes(persistableBundle);
    }

    public static androidx.core.app.Person fromAndroidPerson(android.app.Person person) {
        return androidx.core.app.Person.Api28Impl.bH_(person);
    }

    Person(androidx.core.app.Person.Builder builder) {
        this.Camera2StreamConfigurationMap = builder.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.getInputFormats = builder.getInputFormats;
        this.getHighSpeedVideoFpsRanges = builder.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = builder.getHighSpeedVideoFpsRangesFor;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence("name", this.Camera2StreamConfigurationMap);
        androidx.core.graphics.drawable.IconCompat iconCompat = this.getHighSpeedVideoFpsRangesFor;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString("uri", this.getInputFormats);
        bundle.putString("key", this.getHighSpeedVideoFpsRanges);
        bundle.putBoolean("isBot", this.getHighResolutionOutputSizeshNQ4ISI);
        bundle.putBoolean("isImportant", this.getHighSpeedVideoSizes);
        return bundle;
    }

    public android.os.PersistableBundle toPersistableBundle() {
        return androidx.core.app.Person.Api22Impl.getHighResolutionOutputSizeshNQ4ISI(this);
    }

    public androidx.core.app.Person.Builder toBuilder() {
        return new androidx.core.app.Person.Builder(this);
    }

    public android.app.Person toAndroidPerson() {
        return androidx.core.app.Person.Api28Impl.bI_(this);
    }

    public java.lang.CharSequence getName() {
        return this.Camera2StreamConfigurationMap;
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getUri() {
        return this.getInputFormats;
    }

    public java.lang.String getKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isBot() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isImportant() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String resolveToLegacyUri() {
        java.lang.String str = this.getInputFormats;
        if (str != null) {
            return str;
        }
        if (this.Camera2StreamConfigurationMap != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("name:");
            sb.append((java.lang.Object) this.Camera2StreamConfigurationMap);
            return sb.toString();
        }
        return "";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof androidx.core.app.Person)) {
            return false;
        }
        androidx.core.app.Person person = (androidx.core.app.Person) obj;
        java.lang.String key = getKey();
        java.lang.String key2 = person.getKey();
        if (key == null && key2 == null) {
            return java.util.Objects.equals(java.util.Objects.toString(getName()), java.util.Objects.toString(person.getName())) && java.util.Objects.equals(getUri(), person.getUri()) && java.util.Objects.equals(java.lang.Boolean.valueOf(isBot()), java.lang.Boolean.valueOf(person.isBot())) && java.util.Objects.equals(java.lang.Boolean.valueOf(isImportant()), java.lang.Boolean.valueOf(person.isImportant()));
        }
        return java.util.Objects.equals(key, key2);
    }

    public int hashCode() {
        java.lang.String key = getKey();
        if (key != null) {
            return key.hashCode();
        }
        return java.util.Objects.hash(getName(), getUri(), java.lang.Boolean.valueOf(isBot()), java.lang.Boolean.valueOf(isImportant()));
    }

    /* loaded from: classes7.dex */
    public static class Builder {
        java.lang.String Camera2StreamConfigurationMap;
        androidx.core.graphics.drawable.IconCompat getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        java.lang.CharSequence getHighSpeedVideoSizes;
        java.lang.String getInputFormats;

        public Builder() {
        }

        Builder(androidx.core.app.Person person) {
            this.getHighSpeedVideoSizes = person.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = person.getHighSpeedVideoFpsRangesFor;
            this.getInputFormats = person.getInputFormats;
            this.Camera2StreamConfigurationMap = person.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = person.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = person.getHighSpeedVideoSizes;
        }

        public androidx.core.app.Person.Builder setName(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes = charSequence;
            return this;
        }

        public androidx.core.app.Person.Builder setIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
            this.getHighResolutionOutputSizeshNQ4ISI = iconCompat;
            return this;
        }

        public androidx.core.app.Person.Builder setUri(java.lang.String str) {
            this.getInputFormats = str;
            return this;
        }

        public androidx.core.app.Person.Builder setKey(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
            return this;
        }

        public androidx.core.app.Person.Builder setBot(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
            return this;
        }

        public androidx.core.app.Person.Builder setImportant(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            return this;
        }

        public androidx.core.app.Person build() {
            return new androidx.core.app.Person(this);
        }
    }

    /* loaded from: classes7.dex */
    static class Api22Impl {
        private Api22Impl() {
        }

        static androidx.core.app.Person getHighSpeedVideoSizes(android.os.PersistableBundle persistableBundle) {
            return new androidx.core.app.Person.Builder().setName(persistableBundle.getString("name")).setUri(persistableBundle.getString("uri")).setKey(persistableBundle.getString("key")).setBot(persistableBundle.getBoolean("isBot")).setImportant(persistableBundle.getBoolean("isImportant")).build();
        }

        static android.os.PersistableBundle getHighResolutionOutputSizeshNQ4ISI(androidx.core.app.Person person) {
            android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
            persistableBundle.putString("name", person.Camera2StreamConfigurationMap != null ? person.Camera2StreamConfigurationMap.toString() : null);
            persistableBundle.putString("uri", person.getInputFormats);
            persistableBundle.putString("key", person.getHighSpeedVideoFpsRanges);
            persistableBundle.putBoolean("isBot", person.getHighResolutionOutputSizeshNQ4ISI);
            persistableBundle.putBoolean("isImportant", person.getHighSpeedVideoSizes);
            return persistableBundle;
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static androidx.core.app.Person bH_(android.app.Person person) {
            return new androidx.core.app.Person.Builder().setName(person.getName()).setIcon(person.getIcon() != null ? androidx.core.graphics.drawable.IconCompat.createFromIcon(person.getIcon()) : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }

        static android.app.Person bI_(androidx.core.app.Person person) {
            return new android.app.Person.Builder().setName(person.getName()).setIcon(person.getIcon() != null ? person.getIcon().toIcon() : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }
    }
}
