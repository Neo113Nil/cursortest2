package androidx.compose.foundation.text;

/* compiled from: KeyMapping.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final androidx.compose.foundation.text.KeyMapping defaultKeyMapping;

    public static final androidx.compose.foundation.text.KeyMapping commonKeyMapping(final kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> function1) {
        return new androidx.compose.foundation.text.KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public androidx.compose.foundation.text.KeyCommand mo874mapZmokQxo(android.view.KeyEvent event) {
                if (function1.invoke(androidx.compose.ui.input.key.KeyEvent.m3117boximpl(event)).booleanValue() && androidx.compose.ui.input.key.KeyEvent_androidKt.m3140isShiftPressedZmokQxo(event)) {
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event), androidx.compose.foundation.text.MappedKeys.INSTANCE.m911getZEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(androidx.compose.ui.input.key.KeyEvent.m3117boximpl(event)).booleanValue()) {
                    long m3134getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event);
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m891getCEK5gGoQ()) || androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m901getInsertEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.COPY;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m908getVEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.PASTE;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m909getXEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.CUT;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m888getAEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_ALL;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m910getYEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.REDO;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m911getZEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.UNDO;
                    }
                    return null;
                }
                if (androidx.compose.ui.input.key.KeyEvent_androidKt.m3138isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (androidx.compose.ui.input.key.KeyEvent_androidKt.m3140isShiftPressedZmokQxo(event)) {
                    long m3134getKeyZmokQxo2 = androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event);
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m896getDirectionLeftEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m897getDirectionRightEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m898getDirectionUpEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_UP;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m895getDirectionDownEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_DOWN;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m905getPageUpEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_PAGE_UP;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m904getPageDownEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m903getMoveHomeEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_LINE_START;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m902getMoveEndEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_LINE_END;
                    }
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m901getInsertEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.PASTE;
                    }
                    return null;
                }
                long m3134getKeyZmokQxo3 = androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event);
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m896getDirectionLeftEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.LEFT_CHAR;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m897getDirectionRightEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.RIGHT_CHAR;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m898getDirectionUpEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.UP;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m895getDirectionDownEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.DOWN;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m905getPageUpEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.PAGE_UP;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m904getPageDownEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.PAGE_DOWN;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m903getMoveHomeEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.LINE_START;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m902getMoveEndEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.LINE_END;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m899getEnterEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.NEW_LINE;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m890getBackspaceEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.DELETE_PREV_CHAR;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m894getDeleteEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.DELETE_NEXT_CHAR;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m906getPasteEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.PASTE;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m893getCutEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.CUT;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m892getCopyEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.COPY;
                }
                if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m907getTabEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final androidx.compose.foundation.text.KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }

    static {
        final androidx.compose.foundation.text.KeyMapping commonKeyMapping = commonKeyMapping(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public java.lang.Object get(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.ui.input.key.KeyEvent_androidKt.m3138isCtrlPressedZmokQxo(((androidx.compose.ui.input.key.KeyEvent) obj).m3123unboximpl()));
            }
        });
        defaultKeyMapping = new androidx.compose.foundation.text.KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public androidx.compose.foundation.text.KeyCommand mo874mapZmokQxo(android.view.KeyEvent event) {
                androidx.compose.foundation.text.KeyCommand keyCommand = null;
                if (androidx.compose.ui.input.key.KeyEvent_androidKt.m3140isShiftPressedZmokQxo(event) && androidx.compose.ui.input.key.KeyEvent_androidKt.m3138isCtrlPressedZmokQxo(event)) {
                    long m3134getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event);
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m896getDirectionLeftEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_LEFT_WORD;
                    } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m897getDirectionRightEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_RIGHT_WORD;
                    } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m898getDirectionUpEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo, androidx.compose.foundation.text.MappedKeys.INSTANCE.m895getDirectionDownEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (androidx.compose.ui.input.key.KeyEvent_androidKt.m3138isCtrlPressedZmokQxo(event)) {
                    long m3134getKeyZmokQxo2 = androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event);
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m896getDirectionLeftEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.LEFT_WORD;
                    } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m897getDirectionRightEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.RIGHT_WORD;
                    } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m898getDirectionUpEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.PREV_PARAGRAPH;
                    } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m895getDirectionDownEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.NEXT_PARAGRAPH;
                    } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m900getHEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.DELETE_PREV_CHAR;
                    } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m894getDeleteEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.DELETE_NEXT_WORD;
                    } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m890getBackspaceEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.DELETE_PREV_WORD;
                    } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo2, androidx.compose.foundation.text.MappedKeys.INSTANCE.m889getBackslashEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.DESELECT;
                    }
                } else if (androidx.compose.ui.input.key.KeyEvent_androidKt.m3140isShiftPressedZmokQxo(event)) {
                    long m3134getKeyZmokQxo3 = androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event);
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m903getMoveHomeEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_LINE_LEFT;
                    } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo3, androidx.compose.foundation.text.MappedKeys.INSTANCE.m902getMoveEndEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (androidx.compose.ui.input.key.KeyEvent_androidKt.m3137isAltPressedZmokQxo(event)) {
                    long m3134getKeyZmokQxo4 = androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(event);
                    if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo4, androidx.compose.foundation.text.MappedKeys.INSTANCE.m890getBackspaceEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.DELETE_FROM_LINE_START;
                    } else if (androidx.compose.ui.input.key.Key.m2826equalsimpl0(m3134getKeyZmokQxo4, androidx.compose.foundation.text.MappedKeys.INSTANCE.m894getDeleteEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? androidx.compose.foundation.text.KeyMapping.this.mo874mapZmokQxo(event) : keyCommand;
            }
        };
    }
}
