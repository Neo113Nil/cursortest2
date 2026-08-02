package dagger.hilt.android.internal.builders;

/* loaded from: classes17.dex */
public interface ViewModelComponentBuilder {
    dagger.hilt.android.components.ViewModelComponent build();

    dagger.hilt.android.internal.builders.ViewModelComponentBuilder savedStateHandle(@dagger.BindsInstance androidx.view.SavedStateHandle savedStateHandle);

    dagger.hilt.android.internal.builders.ViewModelComponentBuilder viewModelLifecycle(@dagger.BindsInstance dagger.hilt.android.ViewModelLifecycle viewModelLifecycle);
}
