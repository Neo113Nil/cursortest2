package com.google.android.material.color;

/* loaded from: classes8.dex */
class ResourcesLoaderColorResourcesOverride implements com.google.android.material.color.ColorResourcesOverride {
    private ResourcesLoaderColorResourcesOverride() {
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public boolean applyIfPossible(android.content.Context context, java.util.Map<java.lang.Integer, java.lang.Integer> map) {
        if (!com.google.android.material.color.ResourcesLoaderUtils.addResourcesLoaderToContext(context, map)) {
            return false;
        }
        com.google.android.material.color.ThemeUtils.applyThemeOverlay(context, com.google.android.material.R.style.ThemeOverlay_Material3_PersonalizedColors);
        return true;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public android.content.Context wrapContextIfPossible(android.content.Context context, java.util.Map<java.lang.Integer, java.lang.Integer> map) {
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, com.google.android.material.R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new android.content.res.Configuration());
        return com.google.android.material.color.ResourcesLoaderUtils.addResourcesLoaderToContext(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }

    static com.google.android.material.color.ColorResourcesOverride getInstance() {
        return com.google.android.material.color.ResourcesLoaderColorResourcesOverride.ResourcesLoaderColorResourcesOverrideSingleton.INSTANCE;
    }

    static class ResourcesLoaderColorResourcesOverrideSingleton {
        private static final com.google.android.material.color.ResourcesLoaderColorResourcesOverride INSTANCE = new com.google.android.material.color.ResourcesLoaderColorResourcesOverride();

        private ResourcesLoaderColorResourcesOverrideSingleton() {
        }
    }
}
