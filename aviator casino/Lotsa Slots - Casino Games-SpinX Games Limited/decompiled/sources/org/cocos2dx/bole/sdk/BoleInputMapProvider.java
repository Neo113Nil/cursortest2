package org.cocos2dx.bole.sdk;

/* compiled from: GoogleLogin.java */
/* loaded from: classes6.dex */
class BoleInputMapProvider implements com.google.android.libraries.play.games.inputmapping.InputMappingProvider {

    /* compiled from: GoogleLogin.java */
    public enum InputEventIds {
        SPIN
    }

    BoleInputMapProvider() {
    }

    @Override // com.google.android.libraries.play.games.inputmapping.InputMappingProvider
    public com.google.android.libraries.play.games.inputmapping.datamodel.InputMap onProvideInputMap() {
        return com.google.android.libraries.play.games.inputmapping.datamodel.InputMap.create(java.util.Arrays.asList(com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup.create("Basic Input", java.util.Arrays.asList(com.google.android.libraries.play.games.inputmapping.datamodel.InputAction.create("SPIN", org.cocos2dx.bole.sdk.BoleInputMapProvider.InputEventIds.SPIN.ordinal(), com.google.android.libraries.play.games.inputmapping.datamodel.InputControls.create(java.util.Arrays.asList(62), new java.util.ArrayList()))))), com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings.create(true, true));
    }
}
