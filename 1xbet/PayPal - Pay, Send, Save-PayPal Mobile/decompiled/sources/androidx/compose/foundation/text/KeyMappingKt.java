package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u0007\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "shortcutModifier", "Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/KeyMapping;", "defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyMappingKt {
    private static final androidx.compose.foundation.text.KeyMapping defaultKeyMapping;

    public static final androidx.compose.foundation.text.KeyMapping commonKeyMapping(final kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> function1) {
        return new androidx.compose.foundation.text.KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public final androidx.compose.foundation.text.KeyCommand mo2054mapZmokQxo(android.view.KeyEvent event) {
                if (function1.invoke(androidx.compose.ui.input.key.KeyEvent.m7072boximpl(event)).booleanValue() && androidx.compose.ui.input.key.KeyEvent_androidKt.m7095isShiftPressedZmokQxo(event)) {
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event), androidx.compose.ui.input.key.Key.INSTANCE.m7067getZEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(androidx.compose.ui.input.key.KeyEvent.m7072boximpl(event)).booleanValue()) {
                    long m7089getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event);
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6835getCEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6899getInsertEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.COPY;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m7056getVEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.PASTE;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m7064getXEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.CUT;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6785getAEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_ALL;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m7065getYEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.REDO;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m7067getZEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.UNDO;
                    }
                    return null;
                }
                if (androidx.compose.ui.input.key.KeyEvent_androidKt.m7093isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (androidx.compose.ui.input.key.KeyEvent_androidKt.m7095isShiftPressedZmokQxo(event)) {
                    long m7089getKeyZmokQxo2 = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event);
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6857getDirectionLeftEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6858getDirectionRightEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6859getDirectionUpEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_UP;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6854getDirectionDownEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_DOWN;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6970getPageUpEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_PAGE_UP;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6969getPageDownEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6933getMoveHomeEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_LINE_START;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6932getMoveEndEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.SELECT_LINE_END;
                    }
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6899getInsertEK5gGoQ())) {
                        return androidx.compose.foundation.text.KeyCommand.PASTE;
                    }
                    return null;
                }
                long m7089getKeyZmokQxo3 = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event);
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6857getDirectionLeftEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.LEFT_CHAR;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6858getDirectionRightEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.RIGHT_CHAR;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6859getDirectionUpEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.UP;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6854getDirectionDownEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.DOWN;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6853getDirectionCenterEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.CENTER;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6970getPageUpEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.PAGE_UP;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6969getPageDownEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.PAGE_DOWN;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6933getMoveHomeEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.LINE_START;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6932getMoveEndEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.LINE_END;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6867getEnterEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6959getNumPadEnterEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.NEW_LINE;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6798getBackspaceEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.DELETE_PREV_CHAR;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6852getDeleteEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.DELETE_NEXT_CHAR;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6972getPasteEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.PASTE;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6850getCutEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.CUT;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6847getCopyEK5gGoQ())) {
                    return androidx.compose.foundation.text.KeyCommand.COPY;
                }
                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m7017getTabEK5gGoQ())) {
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
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.ui.input.key.KeyEvent_androidKt.m7093isCtrlPressedZmokQxo(((androidx.compose.ui.input.key.KeyEvent) obj).m7078unboximpl()));
            }
        });
        defaultKeyMapping = new androidx.compose.foundation.text.KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public final androidx.compose.foundation.text.KeyCommand mo2054mapZmokQxo(android.view.KeyEvent event) {
                androidx.compose.foundation.text.KeyCommand keyCommand = null;
                if (androidx.compose.ui.input.key.KeyEvent_androidKt.m7095isShiftPressedZmokQxo(event) && androidx.compose.ui.input.key.KeyEvent_androidKt.m7093isCtrlPressedZmokQxo(event)) {
                    long m7089getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event);
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6857getDirectionLeftEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_LEFT_WORD;
                    } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6858getDirectionRightEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_RIGHT_WORD;
                    } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6859getDirectionUpEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6854getDirectionDownEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (androidx.compose.ui.input.key.KeyEvent_androidKt.m7093isCtrlPressedZmokQxo(event)) {
                    long m7089getKeyZmokQxo2 = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event);
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6857getDirectionLeftEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.LEFT_WORD;
                    } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6858getDirectionRightEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.RIGHT_WORD;
                    } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6859getDirectionUpEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.PREV_PARAGRAPH;
                    } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6854getDirectionDownEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.NEXT_PARAGRAPH;
                    } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6892getHEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.DELETE_PREV_CHAR;
                    } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6852getDeleteEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.DELETE_NEXT_WORD;
                    } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6798getBackspaceEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.DELETE_PREV_WORD;
                    } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6797getBackslashEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.DESELECT;
                    }
                } else if (androidx.compose.ui.input.key.KeyEvent_androidKt.m7095isShiftPressedZmokQxo(event)) {
                    long m7089getKeyZmokQxo3 = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event);
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6933getMoveHomeEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_LINE_START;
                    } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo3, androidx.compose.ui.input.key.Key.INSTANCE.m6932getMoveEndEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.SELECT_LINE_END;
                    }
                } else if (androidx.compose.ui.input.key.KeyEvent_androidKt.m7092isAltPressedZmokQxo(event)) {
                    long m7089getKeyZmokQxo4 = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event);
                    if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo4, androidx.compose.ui.input.key.Key.INSTANCE.m6798getBackspaceEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.DELETE_FROM_LINE_START;
                    } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo4, androidx.compose.ui.input.key.Key.INSTANCE.m6852getDeleteEK5gGoQ())) {
                        keyCommand = androidx.compose.foundation.text.KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? androidx.compose.foundation.text.KeyMapping.this.mo2054mapZmokQxo(event) : keyCommand;
            }
        };
    }
}
